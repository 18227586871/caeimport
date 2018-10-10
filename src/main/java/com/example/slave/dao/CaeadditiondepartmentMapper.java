package com.example.slave.dao;

import com.example.slave.entity.Caeadditiondepartment;
import java.util.List;

public interface CaeadditiondepartmentMapper {
    int deleteByPrimaryKey(String additiondepartmentid);

    int insert(Caeadditiondepartment record);

    Caeadditiondepartment selectByPrimaryKey(String additiondepartmentid);

    List<Caeadditiondepartment> selectAll();

    int updateByPrimaryKey(Caeadditiondepartment record);
}