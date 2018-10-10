package com.example.slave.dao;

import com.example.slave.entity.Caeaffiliatedparty;
import java.util.List;

public interface CaeaffiliatedpartyMapper {
    int deleteByPrimaryKey(String affiliatedpartyid);

    int insert(Caeaffiliatedparty record);

    Caeaffiliatedparty selectByPrimaryKey(String affiliatedpartyid);

    List<Caeaffiliatedparty> selectAll();

    int updateByPrimaryKey(Caeaffiliatedparty record);
}