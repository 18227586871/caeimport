package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademicianaffiliatedpartyMapper;
import com.example.master.entity.Academicianaffiliatedparty;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaeaffiliatedpartyMapper;
import com.example.slave.entity.Caeaffiliatedparty;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademicianaffiliatedpartyServiceImpl implements AcademicianService {

    @Autowired
    private AcademicianaffiliatedpartyMapper academicianaffiliatedpartyMapper;

    @Autowired
    private CaeaffiliatedpartyMapper caeaffiliatedpartyMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academicianaffiliatedparty> list = academicianaffiliatedpartyMapper.getAll(bean);
        for (Academicianaffiliatedparty out : list) {

            Caeaffiliatedparty in = new Caeaffiliatedparty();
            BeanUtils.copyProperties(out, in);

            in.setAffiliatedpartyid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());
            in.setPartisan(out.getPartisanid());
            in.setName(out.getPartisanname());

            in.setShardValue(Common.DB_1);
            caeaffiliatedpartyMapper.insert(in);
        }
    }
}
