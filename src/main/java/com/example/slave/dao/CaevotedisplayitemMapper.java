package com.example.slave.dao;

import com.example.slave.entity.Caevotedisplayitem;
import java.util.List;

public interface CaevotedisplayitemMapper {
    int deleteByPrimaryKey(String displayitemid);

    int insert(Caevotedisplayitem record);

    Caevotedisplayitem selectByPrimaryKey(String displayitemid);

    List<Caevotedisplayitem> selectAll();

    int updateByPrimaryKey(Caevotedisplayitem record);
}