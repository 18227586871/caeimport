package com.example.service.impl;

import com.example.bean.UserBean;
import com.example.mybatis.dao.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public List<UserBean> getAllUser(UserBean bean) {
        // TODO Auto-generated method stub
        return userMapper.getAllUser(bean);
    }

    public void insertUser(UserBean bean) {
        userMapper.insertUser(bean);
    }

}
