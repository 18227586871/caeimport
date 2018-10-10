package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Academician;
import java.util.List;

public interface AcademicianMapper {

    List<Academician> getAll(BaseBean bean);

}