package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidatepatent;
import java.util.List;

public interface CandidatepatentMapper {

    List<Candidatepatent> getAll(BaseBean bean);

}