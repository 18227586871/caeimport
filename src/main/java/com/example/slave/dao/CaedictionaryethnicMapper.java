package com.example.slave.dao;

import com.example.slave.entity.Caedictionaryethnic;
import java.util.List;

public interface CaedictionaryethnicMapper {
    int deleteByPrimaryKey(String ethnicid);

    int insert(Caedictionaryethnic record);

    Caedictionaryethnic selectByPrimaryKey(String ethnicid);

    List<Caedictionaryethnic> selectAll();

    int updateByPrimaryKey(Caedictionaryethnic record);
}