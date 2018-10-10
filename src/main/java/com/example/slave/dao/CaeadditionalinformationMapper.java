package com.example.slave.dao;

import com.example.slave.entity.Caeadditionalinformation;
import java.util.List;

public interface CaeadditionalinformationMapper {
    int deleteByPrimaryKey(String additionalinformationid);

    int insert(Caeadditionalinformation record);

    Caeadditionalinformation selectByPrimaryKey(String additionalinformationid);

    List<Caeadditionalinformation> selectAll();

    int updateByPrimaryKey(Caeadditionalinformation record);
}