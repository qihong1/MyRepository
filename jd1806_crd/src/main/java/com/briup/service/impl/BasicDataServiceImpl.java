package com.briup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.Product;
import com.briup.bean.ProductExample;
import com.briup.bean.Storage;
import com.briup.bean.StorageExample;
import com.briup.common.exception.CrmCommonException;
import com.briup.dao.ProductMapper;
import com.briup.dao.StorageMapper;
import com.briup.service.interf.IBasicDataService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BasicDataServiceImpl implements IBasicDataService{
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private StorageMapper storageMapper;
	
	public PageInfo<Product> findProduct(Product product, int curPage, int row) throws CrmCommonException {
		PageHelper.startPage(curPage, row);
		ProductExample example = new ProductExample();
		example.createCriteria().andProdNameLike("%"+product.getProdName()+"%")
		.andProdTypeLike("%"+product.getProdType()+"%")
		.andProdBatchLike("%"+product.getProdBatch()+"%");
		List<Product> list = productMapper.selectByExample(example);
		return new PageInfo<Product>(list);
	}

	public PageInfo<Product> findAllProduct(int curPage, int row) throws CrmCommonException {
		PageHelper.startPage(curPage, row);
		ProductExample example = new ProductExample();
		List<Product> list = productMapper.selectByExample(example);
		return new PageInfo<Product>(list);
	}

	public PageInfo<Storage> findAllStorage(int curpage, int row) throws CrmCommonException {
		StorageExample example = new StorageExample();
		List<Storage> list = storageMapper.selectByExample(example);
		return new PageInfo<Storage>(list);
	}

	public PageInfo<Storage> findStorage(Storage storage, int curPage, int row) throws CrmCommonException {
		StorageExample example = new StorageExample();
		example.createCriteria().andStkNameLike("%"+storage.getStkName()+"%")
		.andStkWarehourseLike("%"+storage.getStkWarehourse()+"%");
		List<Storage> list = storageMapper.selectByExample(example);
		return new PageInfo<Storage>(list);
	}

}
