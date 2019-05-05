package com.livekampus.services.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livekampus.services.accountservice.entity.UserProfile;
import com.livekampus.services.accountservice.service.ProfileService;

@CrossOrigin(origins ="*",allowedHeaders ="*")
@RestController
public class ProfileController {
	
	@Autowired
	private ProfileService service;
	
	@PostMapping("/profile")
	public ResponseEntity<UserProfile> registerNewAccount(@RequestBody UserProfile profile ){
		UserProfile p= service.createProfile(profile);
		return new ResponseEntity<UserProfile>(p,HttpStatus.CREATED);
	}
	
	@RequestMapping("/update{id}")
	public ResponseEntity<UserProfile> update(){
		UserProfile profile = new UserProfile();
		return new ResponseEntity<UserProfile>(service.createProfile(profile),HttpStatus.OK);
	}
	
	@RequestMapping("/delete{id}")
	public ResponseEntity<UserProfile> delete(){
		UserProfile profile = new UserProfile();
		return new ResponseEntity<UserProfile>(service.deleteProfile(profile),HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
}
