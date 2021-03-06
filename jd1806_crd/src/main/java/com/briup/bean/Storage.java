package com.briup.bean;

import java.io.Serializable;

public class Storage implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STORAGE.STK_ID
     *序号
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private Long stkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STORAGE.STK_WAREHOURSE
     *仓库
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private String stkWarehourse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STORAGE.STK_COUNT
     *件数
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private Long stkCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STORAGE.STK_MEMO
     *备注
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private String stkMemo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STORAGE.STK_WARE
     *货位
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private String stkWare;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STORAGE.STK_NAME
     *产品
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private String stkName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table STORAGE
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STORAGE.STK_ID
     *
     * @return the value of STORAGE.STK_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public Long getStkId() {
        return stkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STORAGE.STK_ID
     *
     * @param stkId the value for STORAGE.STK_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setStkId(Long stkId) {
        this.stkId = stkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STORAGE.STK_WAREHOURSE
     *
     * @return the value of STORAGE.STK_WAREHOURSE
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public String getStkWarehourse() {
        return stkWarehourse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STORAGE.STK_WAREHOURSE
     *
     * @param stkWarehourse the value for STORAGE.STK_WAREHOURSE
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setStkWarehourse(String stkWarehourse) {
        this.stkWarehourse = stkWarehourse == null ? null : stkWarehourse.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STORAGE.STK_COUNT
     *
     * @return the value of STORAGE.STK_COUNT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public Long getStkCount() {
        return stkCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STORAGE.STK_COUNT
     *
     * @param stkCount the value for STORAGE.STK_COUNT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setStkCount(Long stkCount) {
        this.stkCount = stkCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STORAGE.STK_MEMO
     *
     * @return the value of STORAGE.STK_MEMO
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public String getStkMemo() {
        return stkMemo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STORAGE.STK_MEMO
     *
     * @param stkMemo the value for STORAGE.STK_MEMO
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setStkMemo(String stkMemo) {
        this.stkMemo = stkMemo == null ? null : stkMemo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STORAGE.STK_WARE
     *
     * @return the value of STORAGE.STK_WARE
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public String getStkWare() {
        return stkWare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STORAGE.STK_WARE
     *
     * @param stkWare the value for STORAGE.STK_WARE
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setStkWare(String stkWare) {
        this.stkWare = stkWare == null ? null : stkWare.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STORAGE.STK_NAME
     *
     * @return the value of STORAGE.STK_NAME
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public String getStkName() {
        return stkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STORAGE.STK_NAME
     *
     * @param stkName the value for STORAGE.STK_NAME
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setStkName(String stkName) {
        this.stkName = stkName == null ? null : stkName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STORAGE
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stkId=").append(stkId);
        sb.append(", stkWarehourse=").append(stkWarehourse);
        sb.append(", stkCount=").append(stkCount);
        sb.append(", stkMemo=").append(stkMemo);
        sb.append(", stkWare=").append(stkWare);
        sb.append(", stkName=").append(stkName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}