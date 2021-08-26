package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.IUser;

@Repository
public class IUserDaoImpl implements IUserDao {

	@Autowired
	private SessionFactory sessionFactory;

	private IUserDaoImpl() {
		super();
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void createIUser(IUser iuser) {
		getSession().saveOrUpdate(iuser);
		System.out.println("User stored Successfully in DB !!!");

	}

	public List<IUser> getAllIUsers() {
		Query query = getSession().createQuery("from IUser ust");
		List<IUser> ustlist = query.list();
		System.out.println(ustlist);
		return ustlist;
	}

	public IUser getIUser(IUser ust) {
		Criteria c = getSession().createCriteria(IUser.class);
		c.add(Restrictions.eq("email", ust.getEmail()));
		IUser us = (IUser) c.uniqueResult();
		System.out.println("User Retrieved : " + us);
		return us;
	}

	public IUser getIUserbyEmail(String email, String password) {
		return (IUser) getSession()
				.createQuery("select u from IUser u where email = '" + email + "' and password='" + password + "'")
				.uniqueResult();

	}

	public List<IUser> updateIUser(IUser iuser) {
		Query query = getSession().createQuery("update IUser ust set password=:password where uid=:uno");
		query.setParameter("password", iuser.getPassword());
		query.setParameter("uno", iuser.getUid());
		int noofrows = query.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows");
		}

		return getAllIUsers();

	}

	public List<IUser> deleteIUser(int uno) {
		Query query = getSession().createQuery("delete from IUser ust where uid=:uno");
		query.setParameter("uno", uno);
		int noofrows = query.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows");
		}

		return getAllIUsers();

	}

	public IUser getIUserById(int uid) {
		Criteria c = getSession().createCriteria(IUser.class);
		c.add(Restrictions.eq("uid", uid));
		IUser u = (IUser) c.uniqueResult();
		System.out.println("User Retrieved" + u);
		return u;

	}

}
