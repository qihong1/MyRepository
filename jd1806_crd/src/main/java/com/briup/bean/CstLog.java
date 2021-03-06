package com.briup.bean;

import java.io.Serializable;
import java.util.Date;

public class CstLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CST_LOG.LOG_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private Long logId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CST_LOG.LOG_OP
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private String logOp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CST_LOG.LOG_EVENT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private String logEvent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CST_LOG.LOG_DATE
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private Date logDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CST_LOG
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CST_LOG.LOG_ID
     *
     * @return the value of CST_LOG.LOG_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public Long getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CST_LOG.LOG_ID
     *
     * @param logId the value for CST_LOG.LOG_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setLogId(Long logId) {
        this.logId = logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CST_LOG.LOG_OP
     *
     * @return the value of CST_LOG.LOG_OP
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public String getLogOp() {
        return logOp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CST_LOG.LOG_OP
     *
     * @param logOp the value for CST_LOG.LOG_OP
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setLogOp(String logOp) {
        this.logOp = logOp == null ? null : logOp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CST_LOG.LOG_EVENT
     *
     * @return the value of CST_LOG.LOG_EVENT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public String getLogEvent() {
        return logEvent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CST_LOG.LOG_EVENT
     *
     * @param logEvent the value for CST_LOG.LOG_EVENT
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setLogEvent(String logEvent) {
        this.logEvent = logEvent == null ? null : logEvent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CST_LOG.LOG_DATE
     *
     * @return the value of CST_LOG.LOG_DATE
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public Date getLogDate() {
        return logDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CST_LOG.LOG_DATE
     *
     * @param logDate the value for CST_LOG.LOG_DATE
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LOG
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", logOp=").append(logOp);
        sb.append(", logEvent=").append(logEvent);
        sb.append(", logDate=").append(logDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}