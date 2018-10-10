package com.example.slave.dao;

import com.example.slave.entity.Caenationalcongress;
import java.util.List;

public interface CaenationalcongressMapper {
    int deleteByPrimaryKey(String nationalcongressid);

    int insert(Caenationalcongress record);

    Caenationalcongress selectByPrimaryKey(String nationalcongressid);

    List<Caenationalcongress> selectAll();

    int updateByPrimaryKey(Caenationalcongress record);
}