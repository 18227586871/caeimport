package com.example.slave.dao;

import com.example.slave.entity.Caeemployer;
import java.util.List;

public interface CaeemployerMapper {
    int deleteByPrimaryKey(String employerid);

    int insert(Caeemployer record);

    Caeemployer selectByPrimaryKey(String employerid);

    List<Caeemployer> selectAll();

    int updateByPrimaryKey(Caeemployer record);
}