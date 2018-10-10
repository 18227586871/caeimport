package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Academicianpatent;
import java.util.List;

public interface AcademicianpatentMapper {

    List<Academicianpatent> getAll(BaseBean bean);

}