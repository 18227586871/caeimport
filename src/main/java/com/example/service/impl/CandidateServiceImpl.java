package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidateMapper;
import com.example.master.entity.Candidate;
import com.example.service.CandidateService;
import com.example.slave.dao.CaecandidateMapper;
import com.example.slave.entity.Caecandidate;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateMapper candidateMapper;

    @Autowired
    private CaecandidateMapper caecandidateMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidate> list = candidateMapper.getAll(bean);

        System.out.println(list.get(1).getGender());
        for (Candidate out : list) {

            Caecandidate in = new Caecandidate();
            BeanUtils.copyProperties(out, in);

            in.setCandidateid("candidate" + out.getCandidateid());
            if(!StringUtils.isEmpty(out.getDepartmentid())){
                in.setDepartmentid("department" + out.getDepartmentid());
            }
            if(!StringUtils.isEmpty(out.getDivisionselected())){
                in.setDivisionselected("department" + out.getDivisionselected());
            }
            if(!StringUtils.isEmpty(out.getGroupid())){
                in.setGroupid("group" + out.getGroupid());
            }
            in.setGender("男".equals(out.getGender()) ? 1 : "女".equals(out.getGender()) ? 2 : 0);
            in.setIsreview("是".equals(out.getIsreview()) ? 20 : "否".equals(out.getIsreview()) ? 30 : 10);

            in.setShardValue(Common.DB_1);
            caecandidateMapper.insert(in);
        }
    }

    public List<Candidate> getAll(BaseBean bean) {
        return candidateMapper.getAll(bean);
    }
}
