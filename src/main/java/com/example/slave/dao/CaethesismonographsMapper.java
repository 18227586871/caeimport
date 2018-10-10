package com.example.slave.dao;

import com.example.slave.entity.Caethesismonographs;
import java.util.List;

public interface CaethesismonographsMapper {
    int deleteByPrimaryKey(String thesismonographsid);

    int insert(Caethesismonographs record);

    Caethesismonographs selectByPrimaryKey(String thesismonographsid);

    List<Caethesismonographs> selectAll();

    int updateByPrimaryKey(Caethesismonographs record);
}