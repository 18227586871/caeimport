package com.example.slave.dao;

import com.example.slave.entity.Caevoteoption;
import java.util.List;

public interface CaevoteoptionMapper {
    int deleteByPrimaryKey(String voteoptionid);

    int insert(Caevoteoption record);

    Caevoteoption selectByPrimaryKey(String voteoptionid);

    List<Caevoteoption> selectAll();

    int updateByPrimaryKey(Caevoteoption record);
}