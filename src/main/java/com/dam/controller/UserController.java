package com.dam.controller;

import com.dam.repository.entity.User;
import com.dam.service.UserService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/user/save")
	public String save(@RequestParam("id") Long id,
		@RequestParam("name") String name){

		User exitedUser = userService.getUserById(id);

		if (exitedUser != null) {
			return "existed! pls change another id!";
		}

		exitedUser = userService.getUserByName(name);

		if (exitedUser != null) {
			return "existed! pls change another name!";
		}

		User user = new User();
		user.setId(Long.valueOf(id));
		user.setName(name);
		userService.saveUser(user);

		return "save user *" + name + "* success!";
	}

	@RequestMapping("/user/delete")
	public String delete(@RequestParam("id") Long id){

		User exitedUser = userService.getUserById(id);

		if (exitedUser == null) {
			return "sorry, no such user saved before!";
		}

		userService.deleteUser(id);

		return "delete user *" + exitedUser.getName() + "* success!";
	}

	@RequestMapping("/user/list")
	public List<User> list(){

		List<User> users = userService.getAllUsers();

		if (users == null || users.isEmpty()) {
			return Lists.newArrayList();
		}

		return users;
	}

}
