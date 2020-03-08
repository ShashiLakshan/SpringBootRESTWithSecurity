package com.mycode.demo.testdemo.dao;

import java.util.List;

import com.mycode.demo.testdemo.entity.ToDoItem;
import com.mycode.demo.testdemo.entity.User;


public interface ToDoDao {
	
	public List<ToDoItem> findByUser(User user);

	public void save(ToDoItem toDoItem);

}
