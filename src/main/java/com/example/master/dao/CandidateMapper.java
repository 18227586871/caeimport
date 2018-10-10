package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidate;
import java.util.List;

public interface CandidateMapper {

    List<Candidate> getAll(BaseBean bean);

}