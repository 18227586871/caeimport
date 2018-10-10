package com.example.slave.dao;

import com.example.slave.entity.Caereviewresult;
import java.util.List;

public interface CaereviewresultMapper {
    int deleteByPrimaryKey(String reviewresultid);

    int insert(Caereviewresult record);

    Caereviewresult selectByPrimaryKey(String reviewresultid);

    List<Caereviewresult> selectAll();

    int updateByPrimaryKey(Caereviewresult record);
}