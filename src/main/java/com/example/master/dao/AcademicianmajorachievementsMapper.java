package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Academicianmajorachievements;
import java.util.List;

public interface AcademicianmajorachievementsMapper {

    List<Academicianmajorachievements> getAll(BaseBean bean);

}