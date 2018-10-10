package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidatethesismonographs;
import java.util.List;

public interface CandidatethesismonographsMapper {

    List<Candidatethesismonographs> getAll(BaseBean bean);

}