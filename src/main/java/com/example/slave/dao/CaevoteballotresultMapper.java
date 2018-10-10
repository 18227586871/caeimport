package com.example.slave.dao;

import com.example.slave.entity.Caevoteballotresult;
import java.util.List;

public interface CaevoteballotresultMapper {
    int deleteByPrimaryKey(String voteballotresultid);

    int insert(Caevoteballotresult record);

    Caevoteballotresult selectByPrimaryKey(String voteballotresultid);

    List<Caevoteballotresult> selectAll();

    int updateByPrimaryKey(Caevoteballotresult record);
}