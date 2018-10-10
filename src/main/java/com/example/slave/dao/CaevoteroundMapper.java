package com.example.slave.dao;

import com.example.slave.entity.Caevoteround;
import java.util.List;

public interface CaevoteroundMapper {
    int deleteByPrimaryKey(String voteroundid);

    int insert(Caevoteround record);

    Caevoteround selectByPrimaryKey(String voteroundid);

    List<Caevoteround> selectAll();

    int updateByPrimaryKey(Caevoteround record);
}