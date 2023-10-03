package com.user.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	//create fake users list
	List <User> list =  List.of(
			new User(100L, "user1", "1111"),
			new User(101L, "user2", "2222"),
			new User(102L, "user3", "3333")
		);

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
	

	

}
