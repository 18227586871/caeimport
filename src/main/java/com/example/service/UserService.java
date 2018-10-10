package com.example.service;

import java.util.List;

import com.example.bean.UserBean;

//测试方法
public interface UserService {
	List<UserBean> getAllUser(UserBean bean);

	void insertUser(UserBean bean);
}
