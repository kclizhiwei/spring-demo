package com.spring.demo.di.dao;

import com.spring.demo.di.model.User;

public interface UserDao {
	
	public User selectUserById(String userId);
}
