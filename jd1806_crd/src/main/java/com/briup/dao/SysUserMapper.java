package com.briup.dao;

import com.briup.bean.SysUser;
import com.briup.bean.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    long countByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int deleteByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int deleteByPrimaryKey(Long usrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int insert(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int insertSelective(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    List<SysUser> selectByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    SysUser selectByPrimaryKey(Long usrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByPrimaryKey(SysUser record);
}