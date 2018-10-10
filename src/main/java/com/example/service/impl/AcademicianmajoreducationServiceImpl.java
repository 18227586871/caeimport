package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademicianmajoreducationMapper;
import com.example.master.entity.Academicianmajoreducation;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaemajoreducationMapper;
import com.example.slave.entity.Caemajoreducation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademicianmajoreducationServiceImpl implements AcademicianService {

    @Autowired
    private AcademicianmajoreducationMapper academicianmajoreducationMapper;

    @Autowired
    private CaemajoreducationMapper caemajoreducationMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academicianmajoreducation> list = academicianmajoreducationMapper.getAll(bean);
        for (Academicianmajoreducation out : list) {

            Caemajoreducation in = new Caemajoreducation();
            BeanUtils.copyProperties(out, in);

            in.setMajoreducationid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caemajoreducationMapper.insert(in);
        }
    }
}
