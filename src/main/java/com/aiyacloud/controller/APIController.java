package com.aiyacloud.controller;

import com.aiyacloud.domain.req.LoginReq;
import com.aiyacloud.domain.resp.LoginResp;
import com.aiyacloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by toothbond on 16/12/9.
 */
@Controller
@RequestMapping(value = "/api")
public class APIController extends BaseController {

    @Autowired
    UserService userService;
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    @ResponseBody
    public LoginResp login(@RequestBody LoginReq req) {
        return userService.login(req.getUsername(), req.getPassword());
    }
}
