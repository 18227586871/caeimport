package com.example.slave.dao;

import com.example.slave.entity.Caemajorachievements;
import java.util.List;

public interface CaemajorachievementsMapper {
    int deleteByPrimaryKey(String majorachievementsid);

    int insert(Caemajorachievements record);

    Caemajorachievements selectByPrimaryKey(String majorachievementsid);

    List<Caemajorachievements> selectAll();

    int updateByPrimaryKey(Caemajorachievements record);
}