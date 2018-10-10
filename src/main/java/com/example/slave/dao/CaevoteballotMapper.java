package com.example.slave.dao;

import com.example.slave.entity.Caevoteballot;
import java.util.List;

public interface CaevoteballotMapper {
    int deleteByPrimaryKey(String voteballotid);

    int insert(Caevoteballot record);

    Caevoteballot selectByPrimaryKey(String voteballotid);

    List<Caevoteballot> selectAll();

    int updateByPrimaryKey(Caevoteballot record);
}