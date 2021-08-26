package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Customer;
import com.mph.entity.Employee;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CustomerDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	

	public void createCustomer(Customer customer) {
		getSession().saveOrUpdate(customer);
		System.out.println("customer stored Successfully in DB !!!");
	}

	
	public List<Customer> getAllCustomers() {
		Query query=getSession().createQuery("from Customer cust");
		List<Customer> custlist = query.list();
		System.out.println(custlist);
		return custlist; 
	}

	@Override
	public Customer getCustomer(Customer cust) {
		Criteria c =getSession().createCriteria(Customer.class);
		c.add(Restrictions.eq("email", cust.getEmail()));
		Customer cu = (Customer)c.uniqueResult();
		System.out.println("Customer Retrieved : " + cu);
		return cu;
	}

	@Override
	public List<Customer> updateCustomer(Customer customer) {
		Query query = getSession().createQuery("update Customer cust set firstName=:firstName,lastName=:lastName,fatherFirstName=:fatherFirstName,fatherLastName=:fatherLastName,gender=:gender,phoneNo=:phoneNo,AadharNo=:AadharNo,address=:address where cid=:cno");
		query.setParameter("firstName", customer.getFirstName());
		query.setParameter("lastName", customer.getLastName());
		query.setParameter("fatherFirstName", customer.getFatherFirstName());
		query.setParameter("fatherLastName", customer.getFatherLastName());
		query.setParameter("gender", customer.getGender());
		query.setParameter("phoneNo", customer.getPhoneNo());
		query.setParameter("AadharNo", customer.getAadharNo());
		query.setParameter("address", customer.getAddress());
		query.setParameter("cno", customer.getCid());
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Updated " + noofrows + " rows");
		}
		
		return getAllCustomers();

	}


	@Override
	public List<Customer> deleteCustomer(int cno) {
		Query query=getSession().createQuery("delete from Customer cust where cid=:cno");
		query.setParameter("cno", cno);
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Deleted " + noofrows + " rows");
		}
		
		return getAllCustomers();
	
	}
	
   public Customer getCustomerById(int cid){
	   Criteria c = getSession().createCriteria (Customer.class);
	   c.add(Restrictions.eq("cid",cid));
	   Customer e= (Customer)c.uniqueResult(); 
	   System.out.println("Customer Retrieved" + e);
       return e;
       }
	   
	   
   }
   


	


