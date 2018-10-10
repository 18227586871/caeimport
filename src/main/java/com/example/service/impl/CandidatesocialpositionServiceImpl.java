package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidatesocialpositionMapper;
import com.example.master.entity.Candidatesocialposition;
import com.example.service.CandidateService;
import com.example.slave.dao.CaesocialpositionMapper;
import com.example.slave.entity.Caesocialposition;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidatesocialpositionServiceImpl implements CandidateService {

    @Autowired
    private CandidatesocialpositionMapper candidatesocialpositionMapper;

    @Autowired
    private CaesocialpositionMapper caesocialpositionMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidatesocialposition> list = candidatesocialpositionMapper.getAll(bean);
        for (Candidatesocialposition out : list) {

            Caesocialposition in = new Caesocialposition();
            BeanUtils.copyProperties(out, in);

            in.setSocialpositionid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caesocialpositionMapper.insert(in);
        }
    }
}
