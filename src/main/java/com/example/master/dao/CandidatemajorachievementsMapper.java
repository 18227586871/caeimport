package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidatemajorachievements;
import java.util.List;

public interface CandidatemajorachievementsMapper {

    List<Candidatemajorachievements> getAll(BaseBean bean);

}