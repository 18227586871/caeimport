package com.example.slave.dao;

import com.example.slave.entity.Caevoteoptionresult;
import java.util.List;

public interface CaevoteoptionresultMapper {
    int deleteByPrimaryKey(String optionresultid);

    int insert(Caevoteoptionresult record);

    List<Caevoteoptionresult> selectAll();
}