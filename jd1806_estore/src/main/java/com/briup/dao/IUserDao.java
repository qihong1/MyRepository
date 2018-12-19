package com.briup.dao;

import com.briup.bean.User;

public interface IUserDao {
	
	public User findUserByName(String username);
	
	public void saveUser(User user);
	
	public void updateUser(User user);
}
