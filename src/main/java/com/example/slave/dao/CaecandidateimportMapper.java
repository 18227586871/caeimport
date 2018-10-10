package com.example.slave.dao;

import com.example.slave.entity.Caecandidateimport;
import java.util.List;

public interface CaecandidateimportMapper {
    int deleteByPrimaryKey(String candidateimportid);

    int insert(Caecandidateimport record);

    Caecandidateimport selectByPrimaryKey(String candidateimportid);

    List<Caecandidateimport> selectAll();

    int updateByPrimaryKey(Caecandidateimport record);
}