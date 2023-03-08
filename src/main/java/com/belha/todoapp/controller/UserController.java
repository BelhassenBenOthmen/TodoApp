package com.belha.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.belha.todoapp.entity.User;
import com.belha.todoapp.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/list")
	public String listUsers(Model theModel) {
		List<User> theUsers=userService.getAllUsers();
		theModel.addAttribute("users",theUsers);
		return "users/list-users";
	}

}
