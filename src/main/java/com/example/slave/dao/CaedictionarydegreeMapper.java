package com.example.slave.dao;

import com.example.slave.entity.Caedictionarydegree;
import java.util.List;

public interface CaedictionarydegreeMapper {
    int deleteByPrimaryKey(String degreeid);

    int insert(Caedictionarydegree record);

    Caedictionarydegree selectByPrimaryKey(String degreeid);

    List<Caedictionarydegree> selectAll();

    int updateByPrimaryKey(Caedictionarydegree record);
}