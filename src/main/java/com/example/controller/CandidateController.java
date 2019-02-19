package com.example.controller;

import com.example.bean.BaseBean;
import com.example.master.entity.Candidate;
import com.example.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidateController {

    @Autowired
    private CandidateServiceImpl candidateService;

    @Autowired
    private CandidateadditionalinformationServiceImpl candidateadditionalinformationService;

    @Autowired
    private CandidateaffiliatedpartyServiceImpl candidateaffiliatedpartyService;

    @Autowired
    private CandidatecontactinfoServiceImpl candidatecontactinfoService;

    @Autowired
    private CandidateemployerServiceImpl candidateemployerService;

    @Autowired
    private CandidatemainexperienceServiceImpl candidatemainexperienceService;

    @Autowired
    private CandidatemainpositionServiceImpl candidatemainpositionService;

    @Autowired
    private CandidatemajorachievementsServiceImpl candidatemajorachievementsService;

    @Autowired
    private CandidatemajoreducationServiceImpl candidatemajoreducationService;

    @Autowired
    private CandidatenationalcongressServiceImpl candidatenationalcongressService;

    @Autowired
    private CandidatepatentServiceImpl candidatepatentService;

    @Autowired
    private CandidatesocialpositionServiceImpl candidatesocialpositionService;

    @Autowired
    private CandidatetechnologyawardsServiceImpl candidatetechnologyawardsService;

    @Autowired
    private CandidatethesismonographsServiceImpl candidatethesismonographsService;

    @Autowired
    private NominationacademicianServiceImpl nominationacademicianService;

    @Autowired
    private GroupServiceImpl groupService;

    @RequestMapping("/candidate")
    public List<Candidate> demo_1(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<Candidate> list = candidateService.getAll(bean);
        return list;
    }

    @RequestMapping("/group/import")
    public String groupImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        groupService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidate/import")
    public String candidateImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidateService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidateadditionalinformation/import")
    public String candidateadditionalinformationImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidateadditionalinformationService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidateaffiliatedparty/import")
    public String candidateaffiliatedpartyImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidateaffiliatedpartyService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidatecontactinfo/import")
    public String candidatecontactinfoImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidatecontactinfoService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidateemployer/import")
    public String candidateemployerImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidateemployerService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidatemainexperience/import")
    public String candidatemainexperienceImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidatemainexperienceService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidatemainposition/import")
    public String candidatemainpositionImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidatemainpositionService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidatemajorachievements/import")
    public String candidatemajorachievementsImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidatemajorachievementsService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidatemajoreducation/import")
    public String candidatemajoreducationImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidatemajoreducationService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidatenationalcongress/import")
    public String candidatenationalcongressImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidatenationalcongressService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidatepatent/import")
    public String candidatepatentImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidatepatentService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidatesocialposition/import")
    public String candidatesocialpositionImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidatesocialpositionService.importInfo(bean);
        return "Complete";
    }
    @RequestMapping("/candidatetechnologyawards/import")
    public String candidatetechnologyawardsImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidatetechnologyawardsService.importInfo(bean);
        return "Complete";
    }

    @RequestMapping("/candidatethesismonographs/import")
    public String candidatethesismonographsImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        candidatethesismonographsService.importInfo(bean);
        return "Complete";
    }
    @RequestMapping("/nominationacademician/import")
    public String CandidateadditionalinformationImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        nominationacademicianService.importInfo(bean);
        return "Complete";
    }

}
