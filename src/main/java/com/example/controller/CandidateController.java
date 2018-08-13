package com.example.controller;

import com.example.common.Common;
import com.example.master.entity.Candidate;
import com.example.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @RequestMapping("/candidate")
    public List<Candidate> demo_1(String pageNo, String pageSize){
        Candidate candidate = new Candidate();
        candidate.setPageNo(Integer.parseInt(pageNo));
        candidate.setPageSize(Integer.parseInt(pageSize));
        candidate.setShardValue(Common.DB_0);

        List<Candidate> list = candidateService.getAll(candidate);
        return list;
    }
}
