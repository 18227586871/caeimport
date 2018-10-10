package com.example.slave.dao;

import com.example.slave.entity.Caedictionarycountry;
import java.util.List;

public interface CaedictionarycountryMapper {
    int deleteByPrimaryKey(String countryid);

    int insert(Caedictionarycountry record);

    Caedictionarycountry selectByPrimaryKey(String countryid);

    List<Caedictionarycountry> selectAll();

    int updateByPrimaryKey(Caedictionarycountry record);
}