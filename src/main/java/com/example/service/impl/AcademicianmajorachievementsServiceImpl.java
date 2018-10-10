package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.AcademicianmajorachievementsMapper;
import com.example.master.entity.Academicianmajorachievements;
import com.example.service.AcademicianService;
import com.example.slave.dao.CaemajorachievementsMapper;
import com.example.slave.entity.Caemajorachievements;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AcademicianmajorachievementsServiceImpl implements AcademicianService {

    @Autowired
    private AcademicianmajorachievementsMapper academicianmajorachievementsMapper;

    @Autowired
    private CaemajorachievementsMapper caemajorachievementsMapper;

    @Override
    public void importInfo(String pageNo, String pageSize, BaseBean bean) {
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Academicianmajorachievements> list = academicianmajorachievementsMapper.getAll(bean);
        for (Academicianmajorachievements out : list) {

            Caemajorachievements in = new Caemajorachievements();
            BeanUtils.copyProperties(out, in);

            in.setMajorachievementsid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setAcademicianid("academician" + out.getAcademicianid());

            in.setShardValue(Common.DB_1);
            caemajorachievementsMapper.insert(in);
        }
    }
}
