package com.example.slave.dao;

import com.example.slave.entity.Caearea;
import java.util.List;

public interface CaeareaMapper {
    int deleteByPrimaryKey(String areaid);

    int insert(Caearea record);

    Caearea selectByPrimaryKey(String areaid);

    List<Caearea> selectAll();

    int updateByPrimaryKey(Caearea record);
}