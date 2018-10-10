package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidatemajoreducationMapper;
import com.example.master.entity.Candidatemajoreducation;
import com.example.service.CandidateService;
import com.example.slave.dao.CaemajoreducationMapper;
import com.example.slave.entity.Caemajoreducation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidatemajoreducationServiceImpl implements CandidateService {

    @Autowired
    private CandidatemajoreducationMapper candidatemajoreducationMapper;

    @Autowired
    private CaemajoreducationMapper caemajoreducationMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidatemajoreducation> list = candidatemajoreducationMapper.getAll(bean);
        for (Candidatemajoreducation out : list) {

            Caemajoreducation in = new Caemajoreducation();
            BeanUtils.copyProperties(out, in);

            in.setMajoreducationid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caemajoreducationMapper.insert(in);
        }
    }
}
