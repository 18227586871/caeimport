package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidatethesismonographsMapper;
import com.example.master.entity.Candidatethesismonographs;
import com.example.service.CandidateService;
import com.example.slave.dao.CaethesismonographsMapper;
import com.example.slave.entity.Caethesismonographs;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidatethesismonographsServiceImpl implements CandidateService {

    @Autowired
    private CandidatethesismonographsMapper candidatethesismonographsMapper;

    @Autowired
    private CaethesismonographsMapper caethesismonographsMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidatethesismonographs> list = candidatethesismonographsMapper.getAll(bean);
        for (Candidatethesismonographs out : list) {

            Caethesismonographs in = new Caethesismonographs();
            BeanUtils.copyProperties(out, in);

            in.setThesismonographsid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caethesismonographsMapper.insert(in);
        }
    }
}
