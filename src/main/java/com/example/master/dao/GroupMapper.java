package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Group;

import java.util.List;

public interface GroupMapper {

    List<Group> getAll(BaseBean bean);

}