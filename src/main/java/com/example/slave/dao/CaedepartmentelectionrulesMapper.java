package com.example.slave.dao;

import com.example.slave.entity.Caedepartmentelectionrules;
import java.util.List;

public interface CaedepartmentelectionrulesMapper {
    int deleteByPrimaryKey(String departmentelectionrulesid);

    int insert(Caedepartmentelectionrules record);

    Caedepartmentelectionrules selectByPrimaryKey(String departmentelectionrulesid);

    List<Caedepartmentelectionrules> selectAll();

    int updateByPrimaryKey(Caedepartmentelectionrules record);
}