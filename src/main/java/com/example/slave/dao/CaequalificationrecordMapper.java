package com.example.slave.dao;

import com.example.slave.entity.Caequalificationrecord;
import java.util.List;

public interface CaequalificationrecordMapper {
    int deleteByPrimaryKey(String qualificationrecordid);

    int insert(Caequalificationrecord record);

    Caequalificationrecord selectByPrimaryKey(String qualificationrecordid);

    List<Caequalificationrecord> selectAll();

    int updateByPrimaryKey(Caequalificationrecord record);
}