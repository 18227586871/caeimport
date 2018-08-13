package com.example.service;

import java.util.List;

import com.example.bean.UserBean;

public interface UserService {
	List<UserBean> getAllUser(UserBean bean);

	void insertUser(UserBean bean);
}
