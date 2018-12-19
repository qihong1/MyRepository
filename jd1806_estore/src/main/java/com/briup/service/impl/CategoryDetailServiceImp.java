package com.briup.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Category;
import com.briup.bean.CategoryDetail;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.ICategoryDao;
import com.briup.dao.ICategoryDetailDao;
import com.briup.service.ICategoryDetailService;

public class CategoryDetailServiceImp implements ICategoryDetailService{
	private static SqlSession session;
	private static ICategoryDetailDao mapper;
	private static ICategoryDao mapper1;
	static {
		session = MyBatisSqlSessionFactory.openSession();
		 mapper = session.getMapper(ICategoryDetailDao.class);
		 mapper1 = session.getMapper(ICategoryDao.class);
	}
	
	@Override
	public Map<Category, List<CategoryDetail>> listCategoryDetail() {
		Map<Category, List<CategoryDetail>> map = new HashMap<>();
		List<Category> allCategory = mapper1.findAllCategory();
		for (Category category : allCategory) {
			List<CategoryDetail> detailsByCategoryId = mapper.getCategoryDetailsByCategoryId(category.getId());
			map.put(category, detailsByCategoryId);
		}		
		return map;
	}

	@Override
	public List<CategoryDetail> getCategoryDetailsByCategoryId(long id) {
		List<CategoryDetail> categoryDetailList = mapper.getCategoryDetailsByCategoryId(id);
		return categoryDetailList;
	}

	@Override
	public void saveCategoryDetail(CategoryDetail category) {
	}

	@Override
	public void delCategoryDetail(Long categoryDetailId) {
	}

}
