package com.belha.todoapp.service;

import java.util.List;

import com.belha.todoapp.entity.User;

public interface UserService {
	
	public User getUserByUsername(String username);
	public User saveUser(User user);
	public void deleteUser(User user);
	public List<User> getAllUsers();
	
	

}
