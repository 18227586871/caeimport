package com.example.slave.dao;

import com.example.slave.entity.Caemainposition;
import java.util.List;

public interface CaemainpositionMapper {
    int deleteByPrimaryKey(String mainpositionid);

    int insert(Caemainposition record);

    Caemainposition selectByPrimaryKey(String mainpositionid);

    List<Caemainposition> selectAll();

    int updateByPrimaryKey(Caemainposition record);
}