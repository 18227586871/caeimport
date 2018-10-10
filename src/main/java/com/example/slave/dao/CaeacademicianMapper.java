package com.example.slave.dao;

import com.example.slave.entity.Caeacademician;
import java.util.List;

public interface CaeacademicianMapper {
    int deleteByPrimaryKey(String academicianid);

    int insert(Caeacademician record);

    Caeacademician selectByPrimaryKey(String academicianid);

    List<Caeacademician> selectAll();

    int updateByPrimaryKey(Caeacademician record);
}