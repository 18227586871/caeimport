package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademicianmainexperienceMapper;
import com.example.master.entity.Academicianmainexperience;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaemainexperienceMapper;
import com.example.slave.entity.Caemainexperience;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademicianmainexperienceServiceImpl implements AcademicianService {

    @Autowired
    private AcademicianmainexperienceMapper academicianmainexperienceMapper;

    @Autowired
    private CaemainexperienceMapper caemainexperienceMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academicianmainexperience> list = academicianmainexperienceMapper.getAll(bean);
        for (Academicianmainexperience out : list) {

            Caemainexperience in = new Caemainexperience();
            BeanUtils.copyProperties(out, in);

            in.setMainexperienceid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caemainexperienceMapper.insert(in);
        }
    }
}
