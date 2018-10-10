package com.example.slave.dao;

import com.example.slave.entity.Caesocialposition;
import java.util.List;

public interface CaesocialpositionMapper {
    int deleteByPrimaryKey(String socialpositionid);

    int insert(Caesocialposition record);

    Caesocialposition selectByPrimaryKey(String socialpositionid);

    List<Caesocialposition> selectAll();

    int updateByPrimaryKey(Caesocialposition record);
}