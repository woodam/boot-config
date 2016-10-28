package com.dam.service;

import com.dam.repository.UserDao;
import com.dam.repository.entity.User;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;


	public void saveUser(User user) {
		userDao.save(user);
	}

	public void deleteUser(Long id) {
		userDao.delete(id);
	}

	public List<User> getAllUsers() {
		return Lists.newArrayList(userDao.findAll());
	}

	public User getUserByName(String name) {
		return userDao.findByName(name);
	}

	public User getUserById(Long id) {
		return userDao.findOne(id);
	}
}
