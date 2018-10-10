package com.example.slave.dao;

import com.example.slave.entity.Caedictionaryministries;
import java.util.List;

public interface CaedictionaryministriesMapper {
    int deleteByPrimaryKey(String ministriesid);

    int insert(Caedictionaryministries record);

    Caedictionaryministries selectByPrimaryKey(String ministriesid);

    List<Caedictionaryministries> selectAll();

    int updateByPrimaryKey(Caedictionaryministries record);
}