package com.example.slave.dao;

import com.example.slave.entity.Caemainexperience;
import java.util.List;

public interface CaemainexperienceMapper {
    int deleteByPrimaryKey(String mainexperienceid);

    int insert(Caemainexperience record);

    Caemainexperience selectByPrimaryKey(String mainexperienceid);

    List<Caemainexperience> selectAll();

    int updateByPrimaryKey(Caemainexperience record);
}