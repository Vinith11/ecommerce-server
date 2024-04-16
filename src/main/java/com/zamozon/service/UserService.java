package com.zamozon.service;

import java.util.List;

import com.zamozon.exception.UserException;
import com.zamozon.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
