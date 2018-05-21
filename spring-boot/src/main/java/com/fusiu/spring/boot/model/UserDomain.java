package com.fusiu.spring.boot.model;

import java.util.Date;

public class UserDomain {
    private Integer id;
    private Integer userId;
    private String userName;
    private String userAccount;
    private String userCode;
    private String userJobs;
    private String userSex;
    private String userRztype;
    private String userState;
    private String userDepartmentName1;
    private String userDepartmentName2;
    private String userDepartmentpath;
    private Date createtime;
    private Date lastupdatetime;
    private Integer logincount;
    private Date logintime;
    private String logo;
    private String remark;
    private String sign;
    private Integer isvalid;
    private Integer isadmin;

    public UserDomain(Integer id, Integer userId, String userName, String userAccount, String userCode, String userJobs, String userSex, String userRztype, String userState, String userDepartmentName1, String userDepartmentName2, String userDepartmentpath, Date createtime, Date lastupdatetime, Integer logincount, Date logintime, String logo, String remark, String sign, Integer isvalid, Integer isadmin) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.userAccount = userAccount;
        this.userCode = userCode;
        this.userJobs = userJobs;
        this.userSex = userSex;
        this.userRztype = userRztype;
        this.userState = userState;
        this.userDepartmentName1 = userDepartmentName1;
        this.userDepartmentName2 = userDepartmentName2;
        this.userDepartmentpath = userDepartmentpath;
        this.createtime = createtime;
        this.lastupdatetime = lastupdatetime;
        this.logincount = logincount;
        this.logintime = logintime;
        this.logo = logo;
        this.remark = remark;
        this.sign = sign;
        this.isvalid = isvalid;
        this.isadmin = isadmin;
    }

    public UserDomain() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserJobs() {
        return userJobs;
    }

    public void setUserJobs(String userJobs) {
        this.userJobs = userJobs;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserRztype() {
        return userRztype;
    }

    public void setUserRztype(String userRztype) {
        this.userRztype = userRztype;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserDepartmentName1() {
        return userDepartmentName1;
    }

    public void setUserDepartmentName1(String userDepartmentName1) {
        this.userDepartmentName1 = userDepartmentName1;
    }

    public String getUserDepartmentName2() {
        return userDepartmentName2;
    }

    public void setUserDepartmentName2(String userDepartmentName2) {
        this.userDepartmentName2 = userDepartmentName2;
    }

    public String getUserDepartmentpath() {
        return userDepartmentpath;
    }

    public void setUserDepartmentpath(String userDepartmentpath) {
        this.userDepartmentpath = userDepartmentpath;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Integer getLogincount() {
        return logincount;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalid = isvalid;
    }

    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "id=" + id +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userCode='" + userCode + '\'' +
                ", userJobs='" + userJobs + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userRztype='" + userRztype + '\'' +
                ", userState='" + userState + '\'' +
                ", userDepartmentName1='" + userDepartmentName1 + '\'' +
                ", userDepartmentName2='" + userDepartmentName2 + '\'' +
                ", userDepartmentpath='" + userDepartmentpath + '\'' +
                ", createtime=" + createtime +
                ", lastupdatetime=" + lastupdatetime +
                ", logincount=" + logincount +
                ", logintime=" + logintime +
                ", logo='" + logo + '\'' +
                ", remark='" + remark + '\'' +
                ", sign='" + sign + '\'' +
                ", isvalid=" + isvalid +
                ", isadmin=" + isadmin +
                '}';
    }
}
