package com.mycode.demo.testdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycode.demo.testdemo.entity.ToDoItem;
import com.mycode.demo.testdemo.service.ToDoItemService;

@RestController
@RequestMapping("/todo")
public class ToDoItemRestController {
	
	@Autowired
	ToDoItemService toDoItemService;
	
	@RequestMapping(path="/{username}")
	public List<ToDoItem> findTodos(@PathVariable("username") String username) {
	
		return toDoItemService.findByUser(username);
	}

}
