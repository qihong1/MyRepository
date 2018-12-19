package com.briup.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import com.briup.bean.OrderLine;
import com.briup.bean.Product;
import com.briup.bean.ShopCartItem;

public interface IShopCartItemDao {
	
	public void addProduct(ShopCartItem item) throws Exception;
	
	public List<ShopCartItem> findAllProduct(Long user_id) throws Exception;
	
	public ShopCartItem findProductExit(Long product_id) throws Exception;
	
	public void updateShopCartItem(Long productid, Integer number) throws Exception;
	
	void removeProduct(Long productid) throws Exception;
	
	void removeAllProducts() throws Exception;
	
	void updateProduct(Long productid,Integer number) throws Exception;
	
	
	
}






