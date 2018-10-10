package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademicianadditionalinfomationMapper;
import com.example.master.entity.Academicianadditionalinfomation;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaeadditionalinformationMapper;
import com.example.slave.entity.Caeadditionalinformation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademicianadditionalinfomationServiceImpl implements AcademicianService {

    @Autowired
    private AcademicianadditionalinfomationMapper academicianadditionalinfomationMapper;

    @Autowired
    private CaeadditionalinformationMapper caeadditionalinformationMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academicianadditionalinfomation> list = academicianadditionalinfomationMapper.getAll(bean);
        for (Academicianadditionalinfomation out : list) {

            Caeadditionalinformation in = new Caeadditionalinformation();
            BeanUtils.copyProperties(out, in);

            in.setAdditionalinformationid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caeadditionalinformationMapper.insert(in);
        }
    }
}
