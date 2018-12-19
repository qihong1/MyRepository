package com.briup.dao;

import java.util.List;
import java.util.Map;

import com.briup.bean.Category;
import com.briup.bean.CategoryDetail;

public interface ICategoryDetailDao {
	/**
	 * 获取所有的二级菜单
	 * *//*
	public List<CategoryDetail> listCategoryDetail();*/
	
	/**
	 * 根据一级菜单的Id获取二级菜单
	 * */
	public List<CategoryDetail> getCategoryDetailsByCategoryId(long id);
	
}