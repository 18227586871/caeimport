package com.example.slave.dao;

import com.example.slave.entity.Caedictionarynomination;
import java.util.List;

public interface CaedictionarynominationMapper {
    int deleteByPrimaryKey(String nominationid);

    int insert(Caedictionarynomination record);

    Caedictionarynomination selectByPrimaryKey(String nominationid);

    List<Caedictionarynomination> selectAll();

    int updateByPrimaryKey(Caedictionarynomination record);
}