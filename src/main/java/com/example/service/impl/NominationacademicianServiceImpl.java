package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.NominationacademicianMapper;
import com.example.master.entity.Nominationacademician;
import com.example.service.CandidateService;
import com.example.slave.dao.CaenominationacademicianMapper;
import com.example.slave.entity.Caenominationacademician;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NominationacademicianServiceImpl implements CandidateService {

    @Autowired
    private NominationacademicianMapper nominationacademicianMapper;

    @Autowired
    private CaenominationacademicianMapper caenominationacademicianMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Nominationacademician> list = nominationacademicianMapper.getAll(bean);
        for (Nominationacademician out : list) {

            Caenominationacademician in = new Caenominationacademician();
            BeanUtils.copyProperties(out, in);

            in.setNominationacademicianid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());
            in.setAcademiciannumber(Integer.parseInt(out.getAcademicianid()));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caenominationacademicianMapper.insert(in);
        }
    }
}
