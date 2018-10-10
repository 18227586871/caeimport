package com.example.slave.dao;

import com.example.slave.entity.Caecontactinfo;
import java.util.List;

public interface CaecontactinfoMapper {
    int deleteByPrimaryKey(String contactinfoid);

    int insert(Caecontactinfo record);

    Caecontactinfo selectByPrimaryKey(String contactinfoid);

    List<Caecontactinfo> selectAll();

    int updateByPrimaryKey(Caecontactinfo record);
}