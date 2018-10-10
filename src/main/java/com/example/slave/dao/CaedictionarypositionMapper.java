package com.example.slave.dao;

import com.example.slave.entity.Caedictionaryposition;
import java.util.List;

public interface CaedictionarypositionMapper {
    int deleteByPrimaryKey(String positionid);

    int insert(Caedictionaryposition record);

    Caedictionaryposition selectByPrimaryKey(String positionid);

    List<Caedictionaryposition> selectAll();

    int updateByPrimaryKey(Caedictionaryposition record);
}