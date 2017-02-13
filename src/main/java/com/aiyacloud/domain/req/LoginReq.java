package com.aiyacloud.domain.req;

/**
 * Created by toothbond on 16/12/9.
 */
public class LoginReq extends BaseReq{

    String username;
    String password;

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
}
