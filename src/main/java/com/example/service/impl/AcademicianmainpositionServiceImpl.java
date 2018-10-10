package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademicianmainpositionMapper;
import com.example.master.entity.Academicianmainposition;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaemainpositionMapper;
import com.example.slave.entity.Caemainposition;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademicianmainpositionServiceImpl implements AcademicianService {

    @Autowired
    private AcademicianmainpositionMapper academicianmainpositionMapper;

    @Autowired
    private CaemainpositionMapper caemainpositionMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academicianmainposition> list = academicianmainpositionMapper.getAll(bean);
        for (Academicianmainposition out : list) {

            Caemainposition in = new Caemainposition();
            BeanUtils.copyProperties(out, in);

            in.setMainpositionid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caemainpositionMapper.insert(in);
        }
    }
}
