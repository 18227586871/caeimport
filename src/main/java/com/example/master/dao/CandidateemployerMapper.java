package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidateemployer;
import java.util.List;

public interface CandidateemployerMapper {

    List<Candidateemployer> getAll(BaseBean bean);

}