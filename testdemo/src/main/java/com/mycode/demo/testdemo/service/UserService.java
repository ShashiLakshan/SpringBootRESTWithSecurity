package com.mycode.demo.testdemo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mycode.demo.testdemo.entity.User;

public interface UserService extends UserDetailsService{
	
	public User findByUserName(String userName);

	public void save(User user);

}
