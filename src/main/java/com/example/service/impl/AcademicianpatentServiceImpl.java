package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademicianpatentMapper;
import com.example.master.entity.Academicianpatent;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaepatentMapper;
import com.example.slave.entity.Caepatent;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademicianpatentServiceImpl implements AcademicianService {

    @Autowired
    private AcademicianpatentMapper academicianpatentMapper;

    @Autowired
    private CaepatentMapper caepatentMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academicianpatent> list = academicianpatentMapper.getAll(bean);
        for (Academicianpatent out : list) {

            Caepatent in = new Caepatent();
            BeanUtils.copyProperties(out, in);

            in.setPatentid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caepatentMapper.insert(in);
        }
    }
}
