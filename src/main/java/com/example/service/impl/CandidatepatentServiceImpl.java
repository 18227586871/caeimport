package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidatepatentMapper;
import com.example.master.entity.Candidatepatent;
import com.example.service.CandidateService;
import com.example.slave.dao.CaepatentMapper;
import com.example.slave.entity.Caepatent;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidatepatentServiceImpl implements CandidateService {

    @Autowired
    private CandidatepatentMapper candidatepatentMapper;

    @Autowired
    private CaepatentMapper caepatentMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidatepatent> list = candidatepatentMapper.getAll(bean);
        for (Candidatepatent out : list) {

            Caepatent in = new Caepatent();
            BeanUtils.copyProperties(out, in);

            in.setPatentid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caepatentMapper.insert(in);
        }
    }
}
