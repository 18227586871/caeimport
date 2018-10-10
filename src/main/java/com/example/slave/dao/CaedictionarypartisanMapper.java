package com.example.slave.dao;

import com.example.slave.entity.Caedictionarypartisan;
import java.util.List;

public interface CaedictionarypartisanMapper {
    int deleteByPrimaryKey(String partisanid);

    int insert(Caedictionarypartisan record);

    Caedictionarypartisan selectByPrimaryKey(String partisanid);

    List<Caedictionarypartisan> selectAll();

    int updateByPrimaryKey(Caedictionarypartisan record);
}