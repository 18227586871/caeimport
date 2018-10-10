package com.example.slave.dao;

import com.example.slave.entity.Caecandidate;
import java.util.List;

public interface CaecandidateMapper {
    int deleteByPrimaryKey(String candidateid);

    int insert(Caecandidate record);

    Caecandidate selectByPrimaryKey(String candidateid);

    List<Caecandidate> selectAll();

    int updateByPrimaryKey(Caecandidate record);
}