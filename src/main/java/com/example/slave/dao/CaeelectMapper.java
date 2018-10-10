package com.example.slave.dao;

import com.example.slave.entity.Caeelect;
import java.util.List;

public interface CaeelectMapper {
    int deleteByPrimaryKey(String electid);

    int insert(Caeelect record);

    Caeelect selectByPrimaryKey(String electid);

    List<Caeelect> selectAll();

    int updateByPrimaryKey(Caeelect record);
}