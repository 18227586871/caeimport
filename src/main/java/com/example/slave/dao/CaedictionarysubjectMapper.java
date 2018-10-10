package com.example.slave.dao;

import com.example.slave.entity.Caedictionarysubject;
import java.util.List;

public interface CaedictionarysubjectMapper {
    int deleteByPrimaryKey(String subjectid);

    int insert(Caedictionarysubject record);

    Caedictionarysubject selectByPrimaryKey(String subjectid);

    List<Caedictionarysubject> selectAll();

    int updateByPrimaryKey(Caedictionarysubject record);
}