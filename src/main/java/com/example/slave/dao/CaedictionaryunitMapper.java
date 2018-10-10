package com.example.slave.dao;

import com.example.slave.entity.Caedictionaryunit;
import java.util.List;

public interface CaedictionaryunitMapper {
    int deleteByPrimaryKey(String unitid);

    int insert(Caedictionaryunit record);

    Caedictionaryunit selectByPrimaryKey(String unitid);

    List<Caedictionaryunit> selectAll();

    int updateByPrimaryKey(Caedictionaryunit record);
}