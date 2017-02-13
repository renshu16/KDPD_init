package com.aiyacloud.domain.resp;

/**
 * Created by toothbond on 16/12/9.
 */
public class LoginResp extends BaseResp {
    String token = "";

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
