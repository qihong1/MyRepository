package com.briup.bean;

import java.io.Serializable;

public class Orders implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDERS.ODR_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private Long odrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDERS.ODR_CUSTOMER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private String odrCustomer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDERS.ODR_ADDR
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private String odrAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDERS.ODR_STATUS
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private String odrStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDERS.ODR_CUST_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private Long odrCustId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ORDERS
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDERS.ODR_ID
     *
     * @return the value of ORDERS.ODR_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public Long getOdrId() {
        return odrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDERS.ODR_ID
     *
     * @param odrId the value for ORDERS.ODR_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setOdrId(Long odrId) {
        this.odrId = odrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDERS.ODR_CUSTOMER
     *
     * @return the value of ORDERS.ODR_CUSTOMER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public String getOdrCustomer() {
        return odrCustomer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDERS.ODR_CUSTOMER
     *
     * @param odrCustomer the value for ORDERS.ODR_CUSTOMER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setOdrCustomer(String odrCustomer) {
        this.odrCustomer = odrCustomer == null ? null : odrCustomer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDERS.ODR_ADDR
     *
     * @return the value of ORDERS.ODR_ADDR
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public String getOdrAddr() {
        return odrAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDERS.ODR_ADDR
     *
     * @param odrAddr the value for ORDERS.ODR_ADDR
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setOdrAddr(String odrAddr) {
        this.odrAddr = odrAddr == null ? null : odrAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDERS.ODR_STATUS
     *
     * @return the value of ORDERS.ODR_STATUS
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public String getOdrStatus() {
        return odrStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDERS.ODR_STATUS
     *
     * @param odrStatus the value for ORDERS.ODR_STATUS
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setOdrStatus(String odrStatus) {
        this.odrStatus = odrStatus == null ? null : odrStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDERS.ODR_CUST_ID
     *
     * @return the value of ORDERS.ODR_CUST_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public Long getOdrCustId() {
        return odrCustId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDERS.ODR_CUST_ID
     *
     * @param odrCustId the value for ORDERS.ODR_CUST_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setOdrCustId(Long odrCustId) {
        this.odrCustId = odrCustId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", odrId=").append(odrId);
        sb.append(", odrCustomer=").append(odrCustomer);
        sb.append(", odrAddr=").append(odrAddr);
        sb.append(", odrStatus=").append(odrStatus);
        sb.append(", odrCustId=").append(odrCustId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}