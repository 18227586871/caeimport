package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.CandidatemajorachievementsMapper;
import com.example.master.entity.Candidatemajorachievements;
import com.example.service.CandidateService;
import com.example.slave.dao.CaemajorachievementsMapper;
import com.example.slave.entity.Caemajorachievements;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidatemajorachievementsServiceImpl implements CandidateService {

    @Autowired
    private CandidatemajorachievementsMapper candidatemajorachievementsMapper;

    @Autowired
    private CaemajorachievementsMapper caemajorachievementsMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Candidatemajorachievements> list = candidatemajorachievementsMapper.getAll(bean);
        for (Candidatemajorachievements out : list) {

            Caemajorachievements in = new Caemajorachievements();
            BeanUtils.copyProperties(out, in);

            in.setMajorachievementsid(UUID.randomUUID().toString().replaceAll("-", ""));
            in.setCandidateid("candidate" + out.getCandidateid());

            in.setShardValue(Common.DB_1);
            caemajorachievementsMapper.insert(in);
        }
    }
}
