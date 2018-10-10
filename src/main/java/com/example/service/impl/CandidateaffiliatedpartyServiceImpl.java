package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidateaffiliatedpartyMapper;
import com.example.master.entity.Candidateaffiliatedparty;
import com.example.service.CandidateService;
import com.example.slave.dao.CaeaffiliatedpartyMapper;
import com.example.slave.entity.Caeaffiliatedparty;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidateaffiliatedpartyServiceImpl implements CandidateService {

    @Autowired
    private CandidateaffiliatedpartyMapper candidateaffiliatedpartyMapper;

    @Autowired
    private CaeaffiliatedpartyMapper caeaffiliatedpartyMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidateaffiliatedparty> list = candidateaffiliatedpartyMapper.getAll(bean);
        for (Candidateaffiliatedparty out : list) {

            Caeaffiliatedparty in = new Caeaffiliatedparty();
            BeanUtils.copyProperties(out, in);

            in.setAffiliatedpartyid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());
            in.setPartisan(out.getPartisanid());
            in.setName(out.getPartisanname());

            in.setShardValue(Common.DB_1);
            caeaffiliatedpartyMapper.insert(in);
        }
    }
}
