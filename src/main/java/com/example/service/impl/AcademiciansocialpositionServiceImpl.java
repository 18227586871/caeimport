package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademiciansocialpositionMapper;
import com.example.master.entity.Academiciansocialposition;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaesocialpositionMapper;
import com.example.slave.entity.Caesocialposition;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademiciansocialpositionServiceImpl implements AcademicianService {

    @Autowired
    private AcademiciansocialpositionMapper academiciansocialpositionMapper;

    @Autowired
    private CaesocialpositionMapper caesocialpositionMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academiciansocialposition> list = academiciansocialpositionMapper.getAll(bean);
        for (Academiciansocialposition out : list) {

            Caesocialposition in = new Caesocialposition();
            BeanUtils.copyProperties(out, in);

            in.setSocialpositionid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caesocialpositionMapper.insert(in);
        }
    }
}
