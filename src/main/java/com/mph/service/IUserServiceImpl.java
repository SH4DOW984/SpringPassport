package com.mph.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mph.dao.IUserDao;
import com.mph.entity.IUser;

@Service
@Transactional
public class IUserServiceImpl  implements IUserService{

	@Autowired
	IUserDao iuserDao;
	
	
	public void createIUser(IUser iuser) {
		iuserDao.createIUser(iuser);
		
	}

	public List<IUser> getAllIUsers() {
		return iuserDao.getAllIUsers();
	}

	
	public IUser getIUser(IUser ust) {
		return iuserDao.getIUser(ust);
		}
	
	public IUser getIUserbyEmail(String email ,String password) {

		return iuserDao.getIUserbyEmail(email ,password);
	}

	public List<IUser> updateIUser(IUser iuser) {
		return iuserDao.updateIUser(iuser);
	}

	
	public List<IUser> deleteIUser(int uno) {
		return iuserDao.deleteIUser(uno);
	}

	public IUser getIUserById(int uid) {
		return iuserDao.getIUserById(uid);
	}

	

}
