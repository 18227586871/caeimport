package com.example.slave.dao;

import com.example.slave.entity.Caemajoreducation;
import java.util.List;

public interface CaemajoreducationMapper {
    int deleteByPrimaryKey(String majoreducationid);

    int insert(Caemajoreducation record);

    Caemajoreducation selectByPrimaryKey(String majoreducationid);

    List<Caemajoreducation> selectAll();

    int updateByPrimaryKey(Caemajoreducation record);
}