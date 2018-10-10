package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademiciantechnologyawardsMapper;
import com.example.master.entity.Academiciantechnologyawards;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaetechnologyawardsMapper;
import com.example.slave.entity.Caetechnologyawards;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademiciantechnologyawardsServiceImpl implements AcademicianService {

    @Autowired
    private AcademiciantechnologyawardsMapper academiciantechnologyawardsMapper;

    @Autowired
    private CaetechnologyawardsMapper caetechnologyawardsMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academiciantechnologyawards> list = academiciantechnologyawardsMapper.getAll(bean);
        for (Academiciantechnologyawards out : list) {

            Caetechnologyawards in = new Caetechnologyawards();
            BeanUtils.copyProperties(out, in);

            in.setTechnologyawardsid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caetechnologyawardsMapper.insert(in);
        }
    }
}
