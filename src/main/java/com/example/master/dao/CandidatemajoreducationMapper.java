package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidatemajoreducation;
import java.util.List;

public interface CandidatemajoreducationMapper {

    List<Candidatemajoreducation> getAll(BaseBean bean);

}