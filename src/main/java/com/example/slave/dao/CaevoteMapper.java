package com.example.slave.dao;

import com.example.slave.entity.Caevote;
import java.util.List;

public interface CaevoteMapper {
    int deleteByPrimaryKey(String voteid);

    int insert(Caevote record);

    Caevote selectByPrimaryKey(String voteid);

    List<Caevote> selectAll();

    int updateByPrimaryKey(Caevote record);
}