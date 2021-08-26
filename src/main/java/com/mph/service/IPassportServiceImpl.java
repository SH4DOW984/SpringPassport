package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.IPassportDao;
import com.mph.entity.IPassport;



@Service
@Transactional
public class IPassportServiceImpl  implements IPassportService{

    @Autowired
    IPassportDao ipassportDao;
	
	public void createIPassport(IPassport ipassport) {
		ipassportDao.createIPassport(ipassport);
		
	}


	public List<IPassport> getAllIPassports() {
		return ipassportDao.getAllIPassports();
	}

	
	public IPassport getIPassport(IPassport pass) {
		return ipassportDao.getIPassport(pass);
	}

	
	public List<IPassport> updateIPassport(IPassport ipassport) {
		return ipassportDao.updateIPassport(ipassport);
	}

	public List<IPassport> deleteIPassport(int pno) {
		
		return ipassportDao.deleteIPassport(pno) ;
	}

	public IPassport getIPassportById(int passNo) {
		return ipassportDao.getIPassportById(passNo);
	}

	
}
