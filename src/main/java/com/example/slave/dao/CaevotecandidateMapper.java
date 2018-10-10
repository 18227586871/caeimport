package com.example.slave.dao;

import com.example.slave.entity.Caevotecandidate;
import java.util.List;

public interface CaevotecandidateMapper {
    int deleteByPrimaryKey(String votecandidateid);

    int insert(Caevotecandidate record);

    Caevotecandidate selectByPrimaryKey(String votecandidateid);

    List<Caevotecandidate> selectAll();

    int updateByPrimaryKey(Caevotecandidate record);
}