package com.example.master.dao;

import com.example.bean.BaseBean;
import com.example.master.entity.Academicianthesismonographs;
import java.util.List;

public interface AcademicianthesismonographsMapper {

    List<Academicianthesismonographs> getAll(BaseBean bean);

}