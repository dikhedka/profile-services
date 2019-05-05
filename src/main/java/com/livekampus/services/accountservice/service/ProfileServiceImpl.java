package com.livekampus.services.accountservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.livekampus.services.accountservice.entity.*;
import com.livekampus.services.accountservice.dao.ProfileDao;

@Service
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	private ProfileDao dao;

	@Override
	public UserProfile createProfile(UserProfile profile) {
		return dao.save(profile);
	}

	@Override
	public void updateProfile(UserProfile profile) {
		dao.save(profile);
	}

	@Override
	public UserProfile deleteProfile(UserProfile profile) {
		return dao.save(profile);
		
	}
	

}
