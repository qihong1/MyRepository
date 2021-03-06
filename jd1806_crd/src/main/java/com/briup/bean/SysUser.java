package com.briup.bean;

import java.io.Serializable;

public class SysUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USR_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private Long usrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USR_NAME
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private String usrName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USR_PASSWORD
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private String usrPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USR_FLAG
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private Long usrFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USR_ROLE_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private Long usrRoleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USR_ID
     *
     * @return the value of SYS_USER.USR_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public Long getUsrId() {
        return usrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USR_ID
     *
     * @param usrId the value for SYS_USER.USR_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USR_NAME
     *
     * @return the value of SYS_USER.USR_NAME
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public String getUsrName() {
        return usrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USR_NAME
     *
     * @param usrName the value for SYS_USER.USR_NAME
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setUsrName(String usrName) {
        this.usrName = usrName == null ? null : usrName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USR_PASSWORD
     *
     * @return the value of SYS_USER.USR_PASSWORD
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public String getUsrPassword() {
        return usrPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USR_PASSWORD
     *
     * @param usrPassword the value for SYS_USER.USR_PASSWORD
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword == null ? null : usrPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USR_FLAG
     *
     * @return the value of SYS_USER.USR_FLAG
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public Long getUsrFlag() {
        return usrFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USR_FLAG
     *
     * @param usrFlag the value for SYS_USER.USR_FLAG
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setUsrFlag(Long usrFlag) {
        this.usrFlag = usrFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USR_ROLE_ID
     *
     * @return the value of SYS_USER.USR_ROLE_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public Long getUsrRoleId() {
        return usrRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USR_ROLE_ID
     *
     * @param usrRoleId the value for SYS_USER.USR_ROLE_ID
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    public void setUsrRoleId(Long usrRoleId) {
        this.usrRoleId = usrRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbg.generated Tue Oct 23 11:46:45 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usrId=").append(usrId);
        sb.append(", usrName=").append(usrName);
        sb.append(", usrPassword=").append(usrPassword);
        sb.append(", usrFlag=").append(usrFlag);
        sb.append(", usrRoleId=").append(usrRoleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}