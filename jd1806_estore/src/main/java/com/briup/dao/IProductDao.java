package com.briup.dao;
import java.util.List;

import com.briup.bean.Product;


public interface IProductDao {
	
	public List<Product> findAllProducts();
	//根据商品id查找商品
	public Product getProductById(long id);
	//根据二级菜单查找商品
	public List<Product> findProductByCategoryDetailId(Long id);
}