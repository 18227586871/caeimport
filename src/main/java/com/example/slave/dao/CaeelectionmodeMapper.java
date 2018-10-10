package com.example.slave.dao;

import com.example.slave.entity.Caeelectionmode;
import java.util.List;

public interface CaeelectionmodeMapper {
    int deleteByPrimaryKey(String elecmodeid);

    int insert(Caeelectionmode record);

    List<Caeelectionmode> selectAll();
}