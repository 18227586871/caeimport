package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidatesocialposition;
import java.util.List;

public interface CandidatesocialpositionMapper {

    List<Candidatesocialposition> getAll(BaseBean bean);

}