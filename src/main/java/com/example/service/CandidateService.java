package com.example.service;

import com.example.master.entity.Candidate;

import java.util.List;

public interface CandidateService {

    List<Candidate> getAll(Candidate candidate);
}
