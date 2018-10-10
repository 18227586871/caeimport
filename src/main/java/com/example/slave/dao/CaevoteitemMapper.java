package com.example.slave.dao;

import com.example.slave.entity.Caevoteitem;
import java.util.List;

public interface CaevoteitemMapper {
    int deleteByPrimaryKey(String voteitemid);

    int insert(Caevoteitem record);

    Caevoteitem selectByPrimaryKey(String voteitemid);

    List<Caevoteitem> selectAll();

    int updateByPrimaryKey(Caevoteitem record);
}