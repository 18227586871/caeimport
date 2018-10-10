package com.example.service.impl;

import com.example.bean.BaseBean;
import com.example.common.Common;
import com.example.master.dao.GroupMapper;
import com.example.master.entity.Group;
import com.example.service.CandidateService;
import com.example.slave.dao.CaegroupMapper;
import com.example.slave.entity.Caegroup;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements CandidateService {

    @Autowired
    private GroupMapper groupMapper;

    @Autowired
    private CaegroupMapper caegroupMapper;

    @Override
    public void importInfo(BaseBean bean) {
        List<Group> list = groupMapper.getAll(bean);

        for (Group out : list) {

            Caegroup in = new Caegroup();
            BeanUtils.copyProperties(out, in);

            if (!StringUtils.isEmpty(out.getDepartmentid())) {
                in.setDepartmentid("department" + out.getDepartmentid());
            }
            if (!StringUtils.isEmpty(out.getGroupid())) {
                in.setGroupid("group" + out.getGroupid());
            }

            in.setShardValue(Common.DB_1);
            caegroupMapper.insert(in);
        }
    }
}
