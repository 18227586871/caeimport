package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidatemainposition;
import java.util.List;

public interface CandidatemainpositionMapper {

    List<Candidatemainposition> getAll(BaseBean bean);

}