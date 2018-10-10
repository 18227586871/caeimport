package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidatemainpositionMapper;
import com.example.master.entity.Candidatemainposition;
import com.example.service.CandidateService;
import com.example.slave.dao.CaemainpositionMapper;
import com.example.slave.entity.Caemainposition;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidatemainpositionServiceImpl implements CandidateService {

    @Autowired
    private CandidatemainpositionMapper candidatemainpositionMapper;

    @Autowired
    private CaemainpositionMapper caemainpositionMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidatemainposition> list = candidatemainpositionMapper.getAll(bean);
        for (Candidatemainposition out : list) {

            Caemainposition in = new Caemainposition();
            BeanUtils.copyProperties(out, in);

            in.setMainpositionid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caemainpositionMapper.insert(in);
        }
    }
}
