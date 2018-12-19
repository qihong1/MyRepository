package com.briup.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Category;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.ICategoryDao;
import com.briup.service.ICategoryService;

public class CategoryServiceImp implements ICategoryService{
	private static SqlSession session;
	private static ICategoryDao mapper;
	static {
		session = MyBatisSqlSessionFactory.openSession();
		 mapper = session.getMapper(ICategoryDao.class);
	}
	
	@Override
	public List<Category> listCategory() {
		List<Category> list = mapper.findAllCategory();
		return list;
	}

	@Override
	public void saveCategory(Category category) {
	}

	@Override
	public void delCategory(Long categoryId) {
	}

}
