package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidateemployerMapper;
import com.example.master.entity.Candidateemployer;
import com.example.service.CandidateService;
import com.example.slave.dao.CaeemployerMapper;
import com.example.slave.entity.Caeemployer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidateemployerServiceImpl implements CandidateService {

    @Autowired
    private CandidateemployerMapper candidateemployerMapper;

    @Autowired
    private CaeemployerMapper caeemployerMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidateemployer> list = candidateemployerMapper.getAll(bean);
        for (Candidateemployer out : list) {

            Caeemployer in = new Caeemployer();
            BeanUtils.copyProperties(out, in);

            in.setEmployerid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caeemployerMapper.insert(in);
        }
    }
}
