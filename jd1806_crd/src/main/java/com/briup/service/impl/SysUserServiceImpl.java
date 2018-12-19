package com.briup.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.SysRole;
import com.briup.bean.SysRoleExample;
import com.briup.bean.SysUser;
import com.briup.bean.SysUserExample;
import com.briup.bean.SysUserExample.Criteria;
import com.briup.common.exception.CrmCommonException;
import com.briup.dao.SysRoleMapper;
import com.briup.dao.SysUserMapper;
import com.briup.service.interf.ISysUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class SysUserServiceImpl implements ISysUserService{
	
	@Autowired
	private SysUserMapper userMapper;
	@Autowired
	private SysRoleMapper  roleMapper;
	
	public SysUser login(String username, String password) throws CrmCommonException {
		if(StringUtils.isBlank(username)||StringUtils.isBlank(password)) {
			throw CrmCommonException.getException(401);
		}
		SysUserExample example = new SysUserExample();
		Criteria criteria = example.createCriteria().andUsrNameEqualTo(username).andUsrPasswordEqualTo(password);
		List<SysUser> list = userMapper.selectByExample(example);
		return list.get(0);
	}

	public List<SysUser> findAllMgr() throws CrmCommonException {
		return null;
	}

	public List<SysRole> findAllRole() throws CrmCommonException {
		SysRoleExample example = new SysRoleExample();
		List<SysRole> list = roleMapper.selectByExample(example);
		return list;
	}

	public SysRole findRoleBySysRoleId(long roleId) throws CrmCommonException {
		SysRole sysRole = roleMapper.selectByPrimaryKey(roleId);
		return sysRole;
	}

	public void updateRole(SysRole role) throws CrmCommonException {
	}

	public PageInfo<SysUser> findAllSysUser(int curpage, int row) throws CrmCommonException {
		PageHelper.startPage(curpage, row);
		SysUserExample example = new SysUserExample();
		List<SysUser> list = userMapper.selectByExample(example);
		return new PageInfo<SysUser>(list);
	}

	public int getAllRows() throws CrmCommonException {
		return 0;
	}

	public SysUser findOneUser(long usrId) throws CrmCommonException {
		return null;
	}

	public void updateUser(SysUser user) throws CrmCommonException {
		userMapper.updateByPrimaryKey(user);
		if(StringUtils.isBlank(user.getUsrName())||StringUtils.isBlank(user.getUsrPassword())) {
			throw new CrmCommonException(401,"参数为空!");
		}
	}

	public void addUser(SysUser user) throws CrmCommonException {
		 userMapper.insert(user);
	}

	public void deleteUser(long usrId) throws CrmCommonException {
		SysUserExample example = new SysUserExample();
		example.createCriteria().andUsrIdEqualTo(usrId);
		userMapper.deleteByExample(example);
	}

	public void addRole(SysRole role) throws CrmCommonException {
		roleMapper.insert(role);
	}

	public void deleteRole(long roleId) throws CrmCommonException {
	}

}
