package com.briup.service;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import com.briup.bean.OrderLine;
import com.briup.bean.Product;
import com.briup.bean.ShopCartItem;

public interface IShopCartService {
	
	public void addProduct(ShopCartItem item) throws Exception;
	
	public void removeAllProducts() throws Exception;
	
	public List<ShopCartItem> findAllProduct(Long user_id) throws Exception;
	
	public ShopCartItem findProduct(Long productid) throws Exception;
	
	public void updateShopCartItem(Long productid, Integer number) throws Exception;
	
	public void removeProduct(Long productid) throws Exception;
	
	public void updateProduct(Long productid, Integer number) throws Exception;
	
	public int getShopCartSize() throws Exception;
	
}
