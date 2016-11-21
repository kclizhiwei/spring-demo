package com.spring.demo.di.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.di.dao.UserDao;
import com.spring.demo.di.model.User;
import com.spring.demo.di.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User queryUserById(String userId) {
		// TODO Auto-generated method stub
		return userDao.selectUserById(userId);
	}
}
