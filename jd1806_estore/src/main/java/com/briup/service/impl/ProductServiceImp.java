package com.briup.service.impl;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Product;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.common.exception.ProductException;
import com.briup.dao.IProductDao;
import com.briup.service.IProductService;

public class ProductServiceImp implements IProductService{
	private static SqlSession session;
	private static IProductDao mapper;
	static {
		session = MyBatisSqlSessionFactory.openSession();
		 mapper = session.getMapper(IProductDao.class);
	}
	
	@Override
	public List<Product> listProduct() throws ProductException {
		List<Product> list = mapper.findAllProducts();	
		return list;
	}
	
	
	@Override
	public List<Product> listHostProduct() throws ProductException {
		return null;
	}

	@Override
	public List<Product> listProductByCategoryId(long id) throws ProductException {
		return null;
	}

	@Override
	public List<Product> listProductByCategoryDetailId(long id) throws ProductException {
		List<Product> productByCategoryDetailId = mapper.findProductByCategoryDetailId(id);
		return productByCategoryDetailId;
	}

	@Override
	public Set<String> listPublish() throws ProductException {
		return null;
	}

	@Override
	public Product getProductById(long id) throws ProductException {
		Product product = mapper.getProductById(id);
		return product;
	}

	@Override
	public List<String> getCateInfoByProductId(long id) throws ProductException {
		return null;
	}

	

}
