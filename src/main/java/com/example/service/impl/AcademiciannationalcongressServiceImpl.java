package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademiciannationalcongressMapper;
import com.example.master.entity.Academiciannationalcongress;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaenationalcongressMapper;
import com.example.slave.entity.Caenationalcongress;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademiciannationalcongressServiceImpl implements AcademicianService {

    @Autowired
    private AcademiciannationalcongressMapper academiciannationalcongressMapper;

    @Autowired
    private CaenationalcongressMapper caenationalcongressMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academiciannationalcongress> list = academiciannationalcongressMapper.getAll(bean);
        for (Academiciannationalcongress out : list) {

            Caenationalcongress in = new Caenationalcongress();
            BeanUtils.copyProperties(out, in);

            in.setNationalcongressid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caenationalcongressMapper.insert(in);
        }
    }
}
