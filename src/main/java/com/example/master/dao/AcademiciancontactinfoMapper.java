package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Academiciancontactinfo;
import java.util.List;

public interface AcademiciancontactinfoMapper {

    List<Academiciancontactinfo> getAll(BaseBean bean);

}