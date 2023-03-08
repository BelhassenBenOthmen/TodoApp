package com.belha.todoapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belha.todoapp.dao.UserRepository;
import com.belha.todoapp.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User getUserByUsername(String username) {
		Optional<User> res= userRepository.findById(username);
		User theUser=null;
				if(res.isPresent())
					theUser=res.get();
				else
					throw new RuntimeException("User not found!!");
				
				return theUser;
					
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(User user) {

		user.setEnabled(0);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
