package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademicianMapper;
import com.example.master.entity.Academician;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaeacademicianMapper;
import com.example.slave.entity.Caeacademician;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicianServiceImpl implements AcademicianService {

    @Autowired
    private AcademicianMapper academicianMapper;

    @Autowired
    private CaeacademicianMapper caeacademicianMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academician> list = academicianMapper.getAll(bean);

        for (Academician out : list) {

            Caeacademician in = new Caeacademician();
            BeanUtils.copyProperties(out, in);

            in.setAcademicianid("academician" + out.getAcademicianid());
            in.setAcademiciannumber(Integer.parseInt(out.getAcademicianid()));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setGender("男".equals(out.getGender()) ? 1 : "女".equals(out.getGender()) ? 2 : 0);
            in.setIsdead("是".equals(out.getIsdead()) ? 20 : "否".equals(out.getIsdead()) ? 10 : 0);
            in.setIsrecall("是".equals(out.getIsrecall()) ? 20 : "否".equals(out.getIsrecall()) ? 10 : 0);
            in.setIsreview("是".equals(out.getIsreview()) ? 20 : "否".equals(out.getIsreview()) ? 30 : 10);

            in.setShardValue(Common.DB_1);
            caeacademicianMapper.insert(in);
        }
    }
}
