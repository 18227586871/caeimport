package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidateadditionalinformation;
import java.util.List;

public interface CandidateadditionalinformationMapper {

    List<Candidateadditionalinformation> getAll(BaseBean bean);
}