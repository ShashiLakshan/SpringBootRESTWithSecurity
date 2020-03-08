package com.mycode.demo.testdemo.dao;

import com.mycode.demo.testdemo.entity.User;

public interface UserDao {
	
	public User findByUserName(String userName);

	public void save(User user);

}
