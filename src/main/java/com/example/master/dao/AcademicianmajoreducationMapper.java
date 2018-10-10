package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Academicianmajoreducation;
import java.util.List;

public interface AcademicianmajoreducationMapper {

    List<Academicianmajoreducation> getAll(BaseBean bean);

}