package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {
  
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public EmployeeDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public void createEmployee(Employee employee) {
		getSession().saveOrUpdate(employee);
		System.out.println("Employee stored Successfully in DB !!!");
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		Query query = getSession().createQuery("from Employee emp");
		List<Employee> emplist = query.list();
		System.out.println(emplist);
		return emplist; 
	}

	
	public Employee getEmployee(Employee emp) {
		Criteria c = getSession().createCriteria(Employee.class);
		c.add(Restrictions.eq("email", emp.getEmail()));
		Employee em = (Employee)c.uniqueResult();
		System.out.println("Employee Retrieved : " + em);
		return em;
		
	}

	
	public List<Employee> updateEmployee(Employee employee) {
		Query query = getSession().createQuery("update Employee emp set fname=:fname,lname=:lname,gender=:gender where eid=:eno");
		query.setParameter("fname", employee.getFname());
		query.setParameter("lname", employee.getLname());
		query.setParameter("gender", employee.getGender());
		query.setParameter("eno", employee.getEid());
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Updated " + noofrows + " rows");
		}
		
		return getAllEmployees();


	}


	public List<Employee> deleteEmployee(int eno) {
		Query query = getSession().createQuery("delete from Employee emp where eid=:eno");
		query.setParameter("eno", eno);
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Deleted " + noofrows + " rows");
		}
		
		return getAllEmployees();
	}

	
	public Employee getEmployeeById(int eid) {
		Criteria c = getSession().createCriteria (Employee.class);
		c.add(Restrictions.eq("eid",eid));
		Employee e= (Employee)c.uniqueResult(); 
		System.out.println("Employee Retrieved" + e);
        return e;
	}

	

}
