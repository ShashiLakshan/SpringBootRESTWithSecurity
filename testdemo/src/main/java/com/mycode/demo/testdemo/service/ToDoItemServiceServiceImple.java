package com.mycode.demo.testdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycode.demo.testdemo.dao.ToDoDao;
import com.mycode.demo.testdemo.dao.UserDao;
import com.mycode.demo.testdemo.entity.ToDoItem;

@Service
public class ToDoItemServiceServiceImple implements ToDoItemService {
	
	@Autowired
	ToDoDao toDoDao;
	
	@Autowired
	UserDao userDao;

	@Override
	@Transactional
	public List<ToDoItem> findByUser(String userName) {
		
		return toDoDao.findByUser(userDao.findByUserName(userName));
	}

	@Override
	@Transactional
	public void save(ToDoItem toDoItem) {
		toDoDao.save(toDoItem);
	}

}
