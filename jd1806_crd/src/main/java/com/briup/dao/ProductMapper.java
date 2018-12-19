package com.briup.dao;

import com.briup.bean.Product;
import com.briup.bean.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    long countByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int deleteByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int deleteByPrimaryKey(Long prodId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    Product selectByPrimaryKey(Long prodId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    int updateByPrimaryKey(Product record);
}