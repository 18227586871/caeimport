package com.example.slave.dao;

import com.example.slave.entity.Caebusinessmode;
import java.util.List;

public interface CaebusinessmodeMapper {
    int deleteByPrimaryKey(String busimodeid);

    int insert(Caebusinessmode record);

    Caebusinessmode selectByPrimaryKey(String busimodeid);

    List<Caebusinessmode> selectAll();

    int updateByPrimaryKey(Caebusinessmode record);
}