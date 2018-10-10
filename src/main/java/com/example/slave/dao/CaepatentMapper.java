package com.example.slave.dao;

import com.example.slave.entity.Caepatent;
import java.util.List;

public interface CaepatentMapper {
    int deleteByPrimaryKey(String patentid);

    int insert(Caepatent record);

    Caepatent selectByPrimaryKey(String patentid);

    List<Caepatent> selectAll();

    int updateByPrimaryKey(Caepatent record);
}