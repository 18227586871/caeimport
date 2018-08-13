package com.example.master.dao;

import com.example.master.entity.Candidate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CandidateMapper {

    List<Candidate> getAll(Candidate candidate);

}