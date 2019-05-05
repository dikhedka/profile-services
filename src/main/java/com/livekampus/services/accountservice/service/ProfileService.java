package com.livekampus.services.accountservice.service;

import com.livekampus.services.accountservice.entity.UserProfile;

public interface ProfileService {
	
	public UserProfile createProfile(UserProfile profile);
	public void updateProfile(UserProfile profile);
	public UserProfile deleteProfile(UserProfile profile);

}
