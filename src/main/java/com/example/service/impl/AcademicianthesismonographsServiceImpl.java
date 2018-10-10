package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademicianthesismonographsMapper;
import com.example.master.entity.Academicianthesismonographs;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaethesismonographsMapper;
import com.example.slave.entity.Caethesismonographs;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademicianthesismonographsServiceImpl implements AcademicianService {

    @Autowired
    private AcademicianthesismonographsMapper academicianthesismonographsMapper;

    @Autowired
    private CaethesismonographsMapper caethesismonographsMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academicianthesismonographs> list = academicianthesismonographsMapper.getAll(bean);
        for (Academicianthesismonographs out : list) {

            Caethesismonographs in = new Caethesismonographs();
            BeanUtils.copyProperties(out, in);

            in.setThesismonographsid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caethesismonographsMapper.insert(in);
        }
    }
}
