package com.livekampus.services.accountservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livekampus.services.accountservice.entity.UserProfile;


@Repository
public interface ProfileDao extends JpaRepository<UserProfile, String>{

}
