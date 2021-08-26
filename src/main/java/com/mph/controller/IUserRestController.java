package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.IUser;
import com.mph.entity.ValidationEmail;
import com.mph.service.IUserService;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "false", methods = {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT},allowedHeaders = "*")
@RequestMapping(value = "/USER")
/**
 * @author Anuj
 * @version 1.0
 */
public class IUserRestController {

	@Autowired
	IUserService iuserService;
	

	@GetMapping(value = "/alluser")
	public ResponseEntity<List<IUser>> allIUser() {

		List<IUser> ustlist = iuserService.getAllIUsers();
		System.out.println("From Rest alluser : " + ustlist);

		if (ustlist.isEmpty()) {

			return new ResponseEntity<List<IUser>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<IUser>>(ustlist, HttpStatus.OK);

	}
	

	@PostMapping("/createu")
	public IUser createIUser(@RequestBody IUser user) {
		iuserService.createIUser(user);
		return user;
	}

	@PostMapping("/email")
	public ResponseEntity<IUser> getIUserByEmail(@RequestBody ValidationEmail emailToValidate) {

		IUser userRes = iuserService.getIUserbyEmail(emailToValidate.getEmail(), emailToValidate.getPassword());
		// System.out.println(user.getUid());
		if (userRes != null)
			return new ResponseEntity<IUser>(userRes, HttpStatus.OK);
		return new ResponseEntity<IUser>(HttpStatus.NO_CONTENT);
	}
	 

	@PutMapping("/updateu")
	public ResponseEntity<List<IUser>> updateIUser(@RequestBody IUser user) {

		List<IUser> ustlist = iuserService.updateIUser(user);
		System.out.println("From Rest update ust : " + ustlist);

		if (ustlist.isEmpty()) {

			return new ResponseEntity<List<IUser>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<IUser>>(ustlist, HttpStatus.OK);

	}
	

	@DeleteMapping("/deleteu/{id}")
	public ResponseEntity<List<IUser>> deleteIUser(@PathVariable("id") int umid) {

		List<IUser> ustlist = iuserService.deleteIUser(umid);
		System.out.println("From Rest update ust : " + ustlist);

		if (ustlist.isEmpty()) {

			return new ResponseEntity<List<IUser>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<IUser>>(ustlist, HttpStatus.OK);

	}
	

	@GetMapping("/getUser/{id}")
	public ResponseEntity<IUser> getIUserById(@PathVariable("id") int umid) {

		IUser ust = iuserService.getIUserById(umid);
		System.out.println("From getUserby id: " + ust);

		if (ust == null) {

			return new ResponseEntity<IUser>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<IUser>(ust, HttpStatus.OK);

	}

}
