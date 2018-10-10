package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidatenationalcongress;
import java.util.List;

public interface CandidatenationalcongressMapper {

    List<Candidatenationalcongress> getAll(BaseBean bean);

}