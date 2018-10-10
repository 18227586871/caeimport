package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidatemainexperienceMapper;
import com.example.master.entity.Candidatemainexperience;
import com.example.service.CandidateService;
import com.example.slave.dao.CaemainexperienceMapper;
import com.example.slave.entity.Caemainexperience;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidatemainexperienceServiceImpl implements CandidateService {

    @Autowired
    private CandidatemainexperienceMapper candidatemainexperienceMapper;

    @Autowired
    private CaemainexperienceMapper caemainexperienceMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidatemainexperience> list = candidatemainexperienceMapper.getAll(bean);
        for (Candidatemainexperience out : list) {

            Caemainexperience in = new Caemainexperience();
            BeanUtils.copyProperties(out, in);

            in.setMainexperienceid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caemainexperienceMapper.insert(in);
        }
    }
}
