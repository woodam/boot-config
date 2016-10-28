package com.dam.repository;

import com.dam.repository.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
	public User findByName(String name);
}
