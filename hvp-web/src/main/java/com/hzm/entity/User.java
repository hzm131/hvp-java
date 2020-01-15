package com.hzm.entity;

import javax.validation.constraints.Size;

public class User {
    private Integer id;
    @Size(max = 32,min = 1,message = "长度最大32，最小1")
    private String userName;
    @Size(max = 18,min = 6,message = "长度最大18，最小6")
    private String passWord;
    @Size(max = 18,min = 6,message = "长度最大18，最小6")
    private String realName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
