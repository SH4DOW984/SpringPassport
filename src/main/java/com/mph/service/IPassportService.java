package com.mph.service;

import java.util.List;

import com.mph.entity.IPassport;

/**
 * @author Arulmozhi
 * @version 1.0
 */

public interface IPassportService {

	public void createIPassport(IPassport ipassport);
	
	public List<IPassport> getAllIPassports();
	
	public IPassport getIPassport(IPassport pass);
	

	public List<IPassport>  updateIPassport(IPassport ipassport);
	
	public List<IPassport>  deleteIPassport(int pno);
	
	
	
	public IPassport getIPassportById(int passNo);

}
