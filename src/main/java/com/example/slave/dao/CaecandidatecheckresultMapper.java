package com.example.slave.dao;

import com.example.slave.entity.Caecandidatecheckresult;
import java.util.List;

public interface CaecandidatecheckresultMapper {
    int deleteByPrimaryKey(String candidatecheckresultid);

    int insert(Caecandidatecheckresult record);

    Caecandidatecheckresult selectByPrimaryKey(String candidatecheckresultid);

    List<Caecandidatecheckresult> selectAll();

    int updateByPrimaryKey(Caecandidatecheckresult record);
}