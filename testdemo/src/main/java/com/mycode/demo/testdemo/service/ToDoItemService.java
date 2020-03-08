package com.mycode.demo.testdemo.service;

import java.util.List;

import com.mycode.demo.testdemo.entity.ToDoItem;

public interface ToDoItemService {
	
	public List<ToDoItem> findByUser(String userName);

	public void save(ToDoItem toDoItem);

}
