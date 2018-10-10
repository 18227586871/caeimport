package com.example.slave.dao;

import com.example.slave.entity.Caedictionaryunitdepartment;
import java.util.List;

public interface CaedictionaryunitdepartmentMapper {
    int deleteByPrimaryKey(String unitdepartmentid);

    int insert(Caedictionaryunitdepartment record);

    Caedictionaryunitdepartment selectByPrimaryKey(String unitdepartmentid);

    List<Caedictionaryunitdepartment> selectAll();

    int updateByPrimaryKey(Caedictionaryunitdepartment record);
}