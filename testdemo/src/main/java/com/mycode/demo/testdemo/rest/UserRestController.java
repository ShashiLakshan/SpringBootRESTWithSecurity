package com.mycode.demo.testdemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycode.demo.testdemo.entity.User;
import com.mycode.demo.testdemo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<String> registerUser(@RequestBody User user) {

		if (user == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User is not created!");
		}

		if (user.getUserName() == null || user.getUserName().isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Name must be provided!");
		} else {

			if (userService.findByUserName(user.getUserName()) != null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Name is already registered!");
			}
		}

		if (user.getEmail() == null || user.getEmail().isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email must be provided!");
		}

		if (user.getPassword() == null || user.getPassword().isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Password must be provided!");
		}

		try {
			userService.save(user);
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went Wrong!");
		}

		return ResponseEntity.status(HttpStatus.CREATED).body("User is created!");
	}

}
