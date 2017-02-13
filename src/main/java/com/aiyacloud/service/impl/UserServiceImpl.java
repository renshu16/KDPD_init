package com.aiyacloud.service.impl;

import com.aiyacloud.common.utils.DESUtil;
import com.aiyacloud.common.utils.TBTokenAuth;
import com.aiyacloud.dao.domain.entity.User;
import com.aiyacloud.dao.domain.entity.UserExample;
import com.aiyacloud.dao.domain.entity.ext.UserExt;
import com.aiyacloud.dao.mapper.UserMapper;
import com.aiyacloud.domain.resp.LoginResp;
import com.aiyacloud.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by toothbond on 16/12/9.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public LoginResp login(String username, String psw) {

        LoginResp resp = new LoginResp();
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(psw)){
            return resp.missArg();
        }
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(username).andPasswordEqualTo(psw).andIsDeletedEqualTo(false);
        List<User> userList = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(userList)){
            return resp.unAuth();
        }else{
            resp.setToken(TBTokenAuth.generateUserToken(userList.get(0),1));
            return resp.success();
        }
    }

}
