package com.example.slave.dao;

import com.example.slave.entity.Caedictionaryacademic;
import java.util.List;

public interface CaedictionaryacademicMapper {
    int deleteByPrimaryKey(String academicid);

    int insert(Caedictionaryacademic record);

    Caedictionaryacademic selectByPrimaryKey(String academicid);

    List<Caedictionaryacademic> selectAll();

    int updateByPrimaryKey(Caedictionaryacademic record);
}