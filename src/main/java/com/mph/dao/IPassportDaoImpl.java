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
import com.mph.entity.IPassport;

@Repository
public class IPassportDaoImpl implements IPassportDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public IPassportDaoImpl() {
		super();
	}
	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public void createIPassport(IPassport ipassport) {
		getSession().saveOrUpdate(ipassport);
		System.out.println("Employee stored Successfully in DB !!!");
		
		
	}

	
	public List<IPassport> getAllIPassports() {
		Query query = getSession().createQuery("from IPassport pass");
		List<IPassport> passlist = query.list();
		System.out.println(passlist);
		return passlist; 
	}

	@Override
	public IPassport getIPassport(IPassport pass) {
		Criteria c = getSession().createCriteria(IPassport.class);
		IPassport pa = (IPassport)c.uniqueResult();
		System.out.println("IPassport Retrieved : " + pa);
		return pa;
	}

	@Override
	public List<IPassport> updateIPassport(IPassport ipassport) {
		Query query =getSession().createQuery("update IPassport pass set country=:country  where passNo=:pno");
        query.setParameter("country",ipassport.getCountry());
        query.setParameter("pno", ipassport.getPassNo());
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Updated " + noofrows + " rows");
		}
		return getAllIPassports();
		
	
	}
	



	public List<IPassport> deleteIPassport(int pno) {
		Query query = getSession().createQuery("delete from IPassport pass where passNo=:pno");
		query.setParameter("pno", pno);
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Deleted " + noofrows + " rows");
		}
		
		return getAllIPassports();
	}

	@Override
	public IPassport getIPassportById(int passNo) {
		Criteria c = getSession().createCriteria (IPassport.class);
		c.add(Restrictions.eq("passNo",passNo));
		IPassport e= (IPassport)c.uniqueResult(); 
		System.out.println("IPassport Retrieved" + e);
        return e;
	}

	

}
