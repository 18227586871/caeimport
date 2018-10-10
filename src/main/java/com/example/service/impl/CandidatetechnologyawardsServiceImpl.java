package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidatetechnologyawardsMapper;
import com.example.master.entity.Candidatetechnologyawards;
import com.example.service.CandidateService;
import com.example.slave.dao.CaetechnologyawardsMapper;
import com.example.slave.entity.Caetechnologyawards;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidatetechnologyawardsServiceImpl implements CandidateService {

    @Autowired
    private CandidatetechnologyawardsMapper candidatetechnologyawardsMapper;

    @Autowired
    private CaetechnologyawardsMapper caetechnologyawardsMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidatetechnologyawards> list = candidatetechnologyawardsMapper.getAll(bean);
        for (Candidatetechnologyawards out : list) {

            Caetechnologyawards in = new Caetechnologyawards();
            BeanUtils.copyProperties(out, in);

            in.setTechnologyawardsid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caetechnologyawardsMapper.insert(in);
        }
    }
}
