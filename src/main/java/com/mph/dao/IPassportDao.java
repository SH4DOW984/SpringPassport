package com.mph.dao;
import java.util.List;
/**
 * @author Ashish
 * @version 1.0
 */

import com.mph.entity.IPassport;


public interface IPassportDao {



	public void createIPassport(IPassport ipassport);
	
	public List<IPassport> getAllIPassports();
	
	public IPassport getIPassport(IPassport pass);
	
	

	public List<IPassport>  updateIPassport(IPassport ipassport);
	
	public List<IPassport>  deleteIPassport(int pno);
	
	
	public IPassport getIPassportById(int passNo);
}
