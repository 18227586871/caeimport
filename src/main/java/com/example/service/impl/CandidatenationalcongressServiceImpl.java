package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidatenationalcongressMapper;
import com.example.master.entity.Candidatenationalcongress;
import com.example.service.CandidateService;
import com.example.slave.dao.CaenationalcongressMapper;
import com.example.slave.entity.Caenationalcongress;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidatenationalcongressServiceImpl implements CandidateService {

    @Autowired
    private CandidatenationalcongressMapper candidatenationalcongressMapper;

    @Autowired
    private CaenationalcongressMapper caenationalcongressMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidatenationalcongress> list = candidatenationalcongressMapper.getAll(bean);
        for (Candidatenationalcongress out : list) {

            Caenationalcongress in = new Caenationalcongress();
            BeanUtils.copyProperties(out, in);

            in.setNationalcongressid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caenationalcongressMapper.insert(in);
        }
    }
}
