package com.briup.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.CstActivity;
import com.briup.bean.CstCustomer;
import com.briup.bean.CstCustomerExample;
import com.briup.bean.CstLinkman;
import com.briup.common.exception.CrmCommonException;
import com.briup.dao.CstCustomerMapper;
import com.briup.service.interf.ICustomerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private CstCustomerMapper customerMapper;
	
	public List<CstCustomer> findAllCustomer() throws CrmCommonException {
		CstCustomerExample example = new CstCustomerExample();
		List<CstCustomer> list = customerMapper.selectByExample(example);
		return list;
	}

	public CstCustomer findCustomerById(long id) throws CrmCommonException {
		return null;
	}

	public CstCustomer findCustomerByCstName(String cstName) throws CrmCommonException {
		CstCustomerExample example = new CstCustomerExample();
		example.createCriteria().andCustNameEqualTo(cstName);
		List<CstCustomer> list = customerMapper.selectByExample(example);
		return list.get(0);
	}

	public Set<String> findAllCustomerLevelLable() throws CrmCommonException {
		CstCustomerExample example = new CstCustomerExample();
		List<CstCustomer> list = customerMapper.selectByExample(example);
		HashSet<String> set = new HashSet<String>();
		for (CstCustomer cstCustomer : list) {
			set.add(cstCustomer.getCustLevelLabel());
		}
		return set;
	}

	public List<CstCustomer> findCstCustomerByLevelLable(String levelLable) throws CrmCommonException {
		CstCustomerExample example = new CstCustomerExample();
		example.createCriteria().andCustLevelLabelEqualTo(levelLable);
		List<CstCustomer> list = customerMapper.selectByExample(example);
		return list;
	}

	public Set<Integer> findAllCustomerCredit() throws CrmCommonException {
		CstCustomerExample example = new CstCustomerExample();
		List<CstCustomer> list = customerMapper.selectByExample(example);
		HashSet<Integer> set = new HashSet<Integer>();
		for (CstCustomer cstCustomer : list) {
			set.add(cstCustomer.getCustCredit());
		}
		return set;
	}

	public List<CstCustomer> findCstCustomerByCredit(int credit) throws CrmCommonException {
		CstCustomerExample example = new CstCustomerExample();
		example.createCriteria().andCustCreditEqualTo(credit);
		List<CstCustomer> list = customerMapper.selectByExample(example);
		return list;
	}

	public Set<Integer> findAllCustomerSatisfy() throws CrmCommonException {
		CstCustomerExample example = new CstCustomerExample();
		List<CstCustomer> list = customerMapper.selectByExample(example);
		HashSet<Integer> set = new HashSet<Integer>();
		for (CstCustomer cstCustomer : list) {
			set.add(cstCustomer.getCustSatisfy());
		}
		return set;
	}

	public List<CstCustomer> findCstCustomerBySatisfy(int satisfy) throws CrmCommonException {
		CstCustomerExample example = new CstCustomerExample();
		example.createCriteria().andCustCreditEqualTo(satisfy);
		List<CstCustomer> list = customerMapper.selectByExample(example);
		return list;
	}

	public CstCustomer findCustomerByCstNo(String cstNo) throws CrmCommonException {
		return null;
	}

	public void updateCustomer(CstCustomer cstCustomer) throws CrmCommonException {
	}

	public void saveLinkMan(CstLinkman cstLinkman) throws CrmCommonException {
	}

	public void deleteLinkMan(long id) throws CrmCommonException {
	}

	public PageInfo<CstCustomer> findAllCstCustomer(int curpage, int row) throws CrmCommonException {
		PageHelper.startPage(curpage, row);
		CstCustomerExample example = new CstCustomerExample();
		List<CstCustomer> list = customerMapper.selectByExample(example);
		return new PageInfo<CstCustomer>(list);
	}

	//根据条件进行查询
	public PageInfo<CstCustomer> findCustomerPageByCon(int curpage, int row, CstCustomer cstCustomer)
			throws CrmCommonException {
		PageHelper.startPage(curpage, row);
		CstCustomerExample example = new CstCustomerExample();
		example.createCriteria().andCustNoLike("%"+cstCustomer.getCustNo()+"%")
		.andCustNameLike("%"+cstCustomer.getCustName()+"%")
		.andCustRegionLike("%"+cstCustomer.getCustRegion()+"%")
		.andCustManagerNameLike("%"+cstCustomer.getCustManagerName()+"%")
		.andCustLevelLabelLike("%"+cstCustomer.getCustLevelLabel()+"%");
		List<CstCustomer> list = customerMapper.selectByExample(example);
		return new PageInfo<CstCustomer>(list);
	}

	public List<CstLinkman> findAllLinkManByCstId(long cstId) throws CrmCommonException {
		return null;
	}

	public CstLinkman findLinkManById(long id) throws CrmCommonException {
		return null;
	}

	public void updateLinkman(CstLinkman lkm) throws CrmCommonException {
	}

	public void deleteCustomerById(long id) throws CrmCommonException {
	}

	public void saveCstActivity(CstActivity cstActivity) throws CrmCommonException {
	}

	public List<CstActivity> findAllCstActivityByCstNo(String cstNo) throws CrmCommonException {
		return null;
	}

	public CstActivity findCstActivityById(long atvId) throws CrmCommonException {
		return null;
	}

	public void updateAtv(CstActivity cstActivity) throws CrmCommonException {
	}

	public void deleteAtvById(long atvId) throws CrmCommonException {
	}

	public void saveCustomer(CstCustomer cst) throws CrmCommonException {
		customerMapper.insert(cst);
	}

	
}
