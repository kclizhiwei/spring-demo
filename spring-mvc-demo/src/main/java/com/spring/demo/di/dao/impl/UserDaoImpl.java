package com.spring.demo.di.dao.impl;

import org.springframework.stereotype.Repository;

import com.spring.demo.di.dao.UserDao;
import com.spring.demo.di.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public User selectUserById(String userId) {
		return null;
	}

}
