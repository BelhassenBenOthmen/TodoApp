package com.belha.todoapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belha.todoapp.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
