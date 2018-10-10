package com.example.slave.dao;

import com.example.slave.entity.Caetransfergroup;
import java.util.List;

public interface CaetransfergroupMapper {
    int deleteByPrimaryKey(String transfergroupid);

    int insert(Caetransfergroup record);

    Caetransfergroup selectByPrimaryKey(String transfergroupid);

    List<Caetransfergroup> selectAll();

    int updateByPrimaryKey(Caetransfergroup record);
}