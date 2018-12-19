package com.briup.dao;

import com.briup.bean.CstLinkman;
import com.briup.bean.CstLinkmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstLinkmanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    long countByExample(CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int deleteByExample(CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int deleteByPrimaryKey(Long lkmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int insert(CstLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int insertSelective(CstLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    List<CstLinkman> selectByExample(CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    CstLinkman selectByPrimaryKey(Long lkmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") CstLinkman record, @Param("example") CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByExample(@Param("record") CstLinkman record, @Param("example") CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByPrimaryKeySelective(CstLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByPrimaryKey(CstLinkman record);
}