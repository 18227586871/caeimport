package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidateaffiliatedparty;
import java.util.List;

public interface CandidateaffiliatedpartyMapper {

    List<Candidateaffiliatedparty> getAll(BaseBean bean);

}