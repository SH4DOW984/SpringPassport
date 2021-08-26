package com.mph.service;

import java.util.List;

import com.mph.entity.IUser;
/**
 * @author Arulmozhi
 * @version 1.0
 */

public interface IUserService {
	
	public void createIUser(IUser iuser);
	
	public List<IUser> getAllIUsers();
	
	public IUser  getIUser(IUser ust);
	public IUser getIUserbyEmail(String email ,String password);
	

	public List<IUser>  updateIUser(IUser user);
	
	public List<IUser>  deleteIUser(int uno);
	

	
	public IUser getIUserById(int uid);

}
