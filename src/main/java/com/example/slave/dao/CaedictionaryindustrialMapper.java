package com.example.slave.dao;

import com.example.slave.entity.Caedictionaryindustrial;
import java.util.List;

public interface CaedictionaryindustrialMapper {
    int deleteByPrimaryKey(String industrialid);

    int insert(Caedictionaryindustrial record);

    Caedictionaryindustrial selectByPrimaryKey(String industrialid);

    List<Caedictionaryindustrial> selectAll();

    int updateByPrimaryKey(Caedictionaryindustrial record);
}