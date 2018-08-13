package com.example.mybatis.dao;

import java.util.List;

import com.example.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	List<UserBean> getAllUser(UserBean bean);

	void insertUser(UserBean bean);
}
