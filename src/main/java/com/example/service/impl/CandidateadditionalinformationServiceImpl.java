package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidateadditionalinformationMapper;
import com.example.master.entity.Candidateadditionalinformation;
import com.example.service.CandidateService;
import com.example.slave.dao.CaeadditionalinformationMapper;
import com.example.slave.entity.Caeadditionalinformation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidateadditionalinformationServiceImpl implements CandidateService {

    @Autowired
    private CandidateadditionalinformationMapper candidateadditionalinformationMapper;

    @Autowired
    private CaeadditionalinformationMapper caeadditionalinformationMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidateadditionalinformation> list = candidateadditionalinformationMapper.getAll(bean);
        for (Candidateadditionalinformation out : list) {

            Caeadditionalinformation in = new Caeadditionalinformation();
            BeanUtils.copyProperties(out, in);

            in.setAdditionalinformationid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caeadditionalinformationMapper.insert(in);
        }
    }
}
