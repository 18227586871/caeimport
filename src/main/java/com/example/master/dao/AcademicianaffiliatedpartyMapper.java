package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Academicianaffiliatedparty;
import java.util.List;

public interface AcademicianaffiliatedpartyMapper {

    List<Academicianaffiliatedparty> getAll(BaseBean bean);

}