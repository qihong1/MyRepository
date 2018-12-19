package com.briup.service.impl;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.User;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.common.exception.UserException;
import com.briup.dao.IUserDao;
import com.briup.service.IUserService;

public class UserServiceImp implements IUserService{
	private static SqlSession session;
	private static IUserDao mapper;
	static {
		session = MyBatisSqlSessionFactory.openSession();
		 mapper = session.getMapper(IUserDao.class);
	}
	
	@Override
	public void registerUser(User user) throws UserException {
		User u = mapper.findUserByName(user.getUsername());
		if(u!=null) {
			throw new UserException("用户已经存在");
		}else {
			mapper.saveUser(user);
			session.commit(); 
		}
		
	}

	@Override
	public User loginUser(String name, String password) throws UserException {	
		User u = mapper.findUserByName(name);
		if(u!=null) {
			if(!password.equals(u.getPassword())) {
				throw new UserException("密码错误");
			}
		}else {
			throw new UserException("用户名不存在");
		}
		return u;
	}

	@Override
	public User getUserByName(String name) throws UserException {		
		return mapper.findUserByName(name);
	}

	@Override
	public void updateUserInfo(User user) throws UserException {
		mapper.updateUser(user);
		session.commit();
	}

}
