package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidatecontactinfoMapper;
import com.example.master.entity.Candidatecontactinfo;
import com.example.service.CandidateService;
import com.example.slave.dao.CaecontactinfoMapper;
import com.example.slave.entity.Caecontactinfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidatecontactinfoServiceImpl implements CandidateService {

    @Autowired
    private CandidatecontactinfoMapper candidatecontactinfoMapper;

    @Autowired
    private CaecontactinfoMapper caecontactinfoMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidatecontactinfo> list = candidatecontactinfoMapper.getAll(bean);
        for (Candidatecontactinfo out : list) {

            Caecontactinfo in = new Caecontactinfo();
            BeanUtils.copyProperties(out, in);

            in.setContactinfoid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caecontactinfoMapper.insert(in);
        }
    }
}
