package com.example.slave.dao;

import com.example.slave.entity.Caerecogmode;
import java.util.List;

public interface CaerecogmodeMapper {
    int deleteByPrimaryKey(String recogmodeid);

    int insert(Caerecogmode record);

    Caerecogmode selectByPrimaryKey(String recogmodeid);

    List<Caerecogmode> selectAll();

    int updateByPrimaryKey(Caerecogmode record);
}