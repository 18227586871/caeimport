package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademicianemployerMapper;
import com.example.master.entity.Academicianemployer;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaeemployerMapper;
import com.example.slave.entity.Caeemployer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademicianemployerServiceImpl implements AcademicianService {

    @Autowired
    private AcademicianemployerMapper academicianemployerMapper;

    @Autowired
    private CaeemployerMapper caeemployerMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academicianemployer> list = academicianemployerMapper.getAll(bean);
        for (Academicianemployer out : list) {

            Caeemployer in = new Caeemployer();
            BeanUtils.copyProperties(out, in);

            in.setEmployerid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caeemployerMapper.insert(in);
        }
    }
}
