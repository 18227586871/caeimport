package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademiciancontactinfoMapper;
import com.example.master.entity.Academiciancontactinfo;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaecontactinfoMapper;
import com.example.slave.entity.Caecontactinfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class AcademiciancontactinfoServiceImpl implements AcademicianService {

    @Autowired
    private AcademiciancontactinfoMapper academiciancontactinfoMapper;

    @Autowired
    private CaecontactinfoMapper caecontactinfoMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academiciancontactinfo> list = academiciancontactinfoMapper.getAll(bean);
        for (Academiciancontactinfo out : list) {

            Caecontactinfo in = new Caecontactinfo();
            BeanUtils.copyProperties(out, in);

            in.setContactinfoid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caecontactinfoMapper.insert(in);
        }
    }
}
