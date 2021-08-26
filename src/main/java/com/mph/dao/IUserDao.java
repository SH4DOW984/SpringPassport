package com.mph.dao;

import java.util.List;
/**
 * @author Ashish
 * @version 1.0
 */

import com.mph.entity.IUser;

public interface IUserDao {

	

		public void createIUser(IUser iuser);
		
		
		public List<IUser> getAllIUsers();
		
		public IUser  getIUser(IUser ust);
		
		
		public IUser getIUserbyEmail(String email ,String password);
		
		public List<IUser>  updateIUser(IUser iuser);
		
		public List<IUser>  deleteIUser(int uno);
		

		
		
		public IUser getIUserById(int uid);
}
