package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Employee;
import com.mph.entity.IPassport;
import com.mph.service.IPassportService;

 

@RestController
@RequestMapping(value = "/IPASSPORT")
/**
 * @author Anuj
 * @version 1.0
 */
public class IPassportRestController {
 
	@Autowired
	IPassportService  ipassportService;
	
	      
	
	@GetMapping("/allipassport")
	public ResponseEntity<List< IPassport>> allIPassport() {
		
		List<IPassport> passlist =  ipassportService.getAllIPassports();
		System.out.println("From Rest  allIPassport : " + passlist);
		
		if(passlist.isEmpty()) {
			
			return new ResponseEntity<List< IPassport>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List< IPassport>>(passlist,HttpStatus.OK);		
		
	}
	

	
	@PostMapping("/createipassport")
	public IPassport createIPassport(@RequestBody   IPassport ipassport) {
		ipassportService.createIPassport( ipassport);
		return  ipassport;
	}
	 
	@PutMapping("/updatePass")
	public ResponseEntity<List<IPassport>> updateEmployee(@RequestBody IPassport ipassport) {
		
		List<IPassport> passlist = ipassportService.updateIPassport(ipassport);
		System.out.println("From Rest update pass: " + passlist);
		
		if(passlist.isEmpty()) {
			
			return new ResponseEntity<List<IPassport>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<IPassport>>(passlist,HttpStatus.OK);		
		
	}
	
	@DeleteMapping("/deletePass/{id}")
	public ResponseEntity<List<IPassport>> deleteIPassport(@PathVariable("id") int pmid) {
		
		List<IPassport> passlist =ipassportService.deleteIPassport(pmid);
		System.out.println("From Rest update emp : " + passlist);
		
		if(passlist.isEmpty()) {
			
			return new ResponseEntity<List<IPassport>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<IPassport>>(passlist,HttpStatus.OK);		
		
	}
	
	
	@GetMapping("/getPass/{id}")
	public ResponseEntity<IPassport> getEmployeeById(@PathVariable("id") int pmid) {
		
		IPassport pass = ipassportService.getIPassportById(pmid);
		System.out.println("From getPassby id: " + pass);
		
		if(pass==null) {
			
			return new ResponseEntity<IPassport>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<IPassport>(pass,HttpStatus.OK);		
		
	}
 
}