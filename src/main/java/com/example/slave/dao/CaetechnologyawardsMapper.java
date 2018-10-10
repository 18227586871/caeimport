package com.example.slave.dao;

import com.example.slave.entity.Caetechnologyawards;
import java.util.List;

public interface CaetechnologyawardsMapper {
    int deleteByPrimaryKey(String technologyawardsid);

    int insert(Caetechnologyawards record);

    Caetechnologyawards selectByPrimaryKey(String technologyawardsid);

    List<Caetechnologyawards> selectAll();

    int updateByPrimaryKey(Caetechnologyawards record);
}