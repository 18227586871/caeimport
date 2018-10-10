package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Nominationacademician;
import java.util.List;

public interface NominationacademicianMapper {

    List<Nominationacademician> getAll(BaseBean bean);

}