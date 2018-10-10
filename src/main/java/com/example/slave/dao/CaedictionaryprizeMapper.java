package com.example.slave.dao;

import com.example.slave.entity.Caedictionaryprize;
import java.util.List;

public interface CaedictionaryprizeMapper {
    int deleteByPrimaryKey(String prizeid);

    int insert(Caedictionaryprize record);

    Caedictionaryprize selectByPrimaryKey(String prizeid);

    List<Caedictionaryprize> selectAll();

    int updateByPrimaryKey(Caedictionaryprize record);
}