package com.hzm.param;

import org.hibernate.validator.constraints.Length;

public class LoginUtils {
    @Length(max = 32,min = 1,message = "长度最大32，最小1")
    private String username;
    @Length(max = 18,min = 6,message = "长度最大18，最小6")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginUtils{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
