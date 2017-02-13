package com.aiyacloud.service;

import com.aiyacloud.domain.resp.LoginResp;

/**
 * Created by toothbond on 16/12/9.
 */
public interface UserService {

    LoginResp login(String username, String psw);

}
