package com.example.slave.dao;

import com.example.slave.entity.Caenominationacademician;
import java.util.List;

public interface CaenominationacademicianMapper {
    int deleteByPrimaryKey(String nominationacademicianid);

    int insert(Caenominationacademician record);

    Caenominationacademician selectByPrimaryKey(String nominationacademicianid);

    List<Caenominationacademician> selectAll();

    int updateByPrimaryKey(Caenominationacademician record);
}