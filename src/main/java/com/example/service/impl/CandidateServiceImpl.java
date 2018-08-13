package com.example.service.impl;

import com.example.master.dao.CandidateMapper;
import com.example.master.entity.Candidate;
import com.example.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateMapper candidateMapper;

    @Override
    public List<Candidate> getAll(Candidate candidate) {
        return candidateMapper.getAll(candidate);
    }
}
