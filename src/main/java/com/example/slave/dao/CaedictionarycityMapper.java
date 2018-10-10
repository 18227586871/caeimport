package com.example.slave.dao;

import com.example.slave.entity.Caedictionarycity;
import java.util.List;

public interface CaedictionarycityMapper {
    int deleteByPrimaryKey(String cityid);

    int insert(Caedictionarycity record);

    Caedictionarycity selectByPrimaryKey(String cityid);

    List<Caedictionarycity> selectAll();

    int updateByPrimaryKey(Caedictionarycity record);
}