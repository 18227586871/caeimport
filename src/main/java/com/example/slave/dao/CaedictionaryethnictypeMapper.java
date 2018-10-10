package com.example.slave.dao;

import com.example.slave.entity.Caedictionaryethnictype;
import java.util.List;

public interface CaedictionaryethnictypeMapper {
    int deleteByPrimaryKey(String ethnictypeid);

    int insert(Caedictionaryethnictype record);

    Caedictionaryethnictype selectByPrimaryKey(String ethnictypeid);

    List<Caedictionaryethnictype> selectAll();

    int updateByPrimaryKey(Caedictionaryethnictype record);
}