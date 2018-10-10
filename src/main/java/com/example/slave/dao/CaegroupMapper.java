package com.example.slave.dao;

import com.example.slave.entity.Caegroup;
import java.util.List;

public interface CaegroupMapper {
    int deleteByPrimaryKey(String groupid);

    int insert(Caegroup record);

    Caegroup selectByPrimaryKey(String groupid);

    List<Caegroup> selectAll();

    int updateByPrimaryKey(Caegroup record);
}