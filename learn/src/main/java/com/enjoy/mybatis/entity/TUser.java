package com.enjoy.mybatis.entity;

import java.io.Serializable;

public class TUser implements Serializable {
    private Integer id;
    private String userName;
    private String realName;
    private Byte sex;
    private String mobile;

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public Byte getSex() {
        return sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", sex=" + sex +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
