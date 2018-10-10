package com.example.slave.dao;

import com.example.slave.entity.Caeennualelectionrules;
import java.util.List;

public interface CaeennualelectionrulesMapper {
    int deleteByPrimaryKey(String ennualelectionrulesid);

    int insert(Caeennualelectionrules record);

    Caeennualelectionrules selectByPrimaryKey(String ennualelectionrulesid);

    List<Caeennualelectionrules> selectAll();

    int updateByPrimaryKey(Caeennualelectionrules record);
}