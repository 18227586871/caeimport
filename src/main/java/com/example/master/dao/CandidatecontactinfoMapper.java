package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidatecontactinfo;
import java.util.List;

public interface CandidatecontactinfoMapper {

    List<Candidatecontactinfo> getAll(BaseBean bean);

}