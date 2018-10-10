package com.example.slave.dao;

import com.example.slave.entity.Caedepartment;
import java.util.List;

public interface CaedepartmentMapper {
    int deleteByPrimaryKey(String departmentid);

    int insert(Caedepartment record);

    Caedepartment selectByPrimaryKey(String departmentid);

    List<Caedepartment> selectAll();

    int updateByPrimaryKey(Caedepartment record);
}