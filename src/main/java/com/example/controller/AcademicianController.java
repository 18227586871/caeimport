package com.example.controller;

import com.example.bean.BaseBean;
import com.example.master.entity.Academician;
import com.example.master.entity.Academicianadditionalinfomation;
import com.example.master.entity.Candidate;
import com.example.service.AcademicianService;
import com.example.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AcademicianController {

    @Autowired
    private AcademicianServiceImpl academicianService;

    @Autowired
    private AcademicianadditionalinfomationServiceImpl academicianadditionalinfomationService;

    @Autowired
    private AcademicianaffiliatedpartyServiceImpl academicianaffiliatedpartyService;

    @Autowired
    private AcademiciancontactinfoServiceImpl academiciancontactinfoService;

    @Autowired
    private AcademicianemployerServiceImpl academicianemployerService;

    @Autowired
    private AcademicianmainexperienceServiceImpl academicianmainexperienceService;

    @Autowired
    private AcademicianmainpositionServiceImpl academicianmainpositionService;

    @Autowired
    private AcademicianmajorachievementsServiceImpl academicianmajorachievementsService;

    @Autowired
    private AcademicianmajoreducationServiceImpl academicianmajoreducationService;

    @Autowired
    private AcademiciannationalcongressServiceImpl academiciannationalcongressService;

    @Autowired
    private AcademicianpatentServiceImpl academicianpatentService;

    @Autowired
    private AcademiciansocialpositionServiceImpl academiciansocialpositionService;

    @Autowired
    private AcademiciantechnologyawardsServiceImpl academiciantechnologyawardsService;

    @Autowired
    private AcademicianthesismonographsServiceImpl academicianthesismonographsService;


    @RequestMapping("/academician/import")
    public String academicianImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academicianService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academicianadditionalinfomation/import")
    public String academicianadditionalinfomationImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academicianadditionalinfomationService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academicianaffiliatedparty/import")
    public String academicianaffiliatedpartyImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academicianaffiliatedpartyService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academiciancontactinfo/import")
    public String academiciancontactinfoImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academiciancontactinfoService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academicianemployer/import")
    public String academicianemployerImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academicianemployerService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academicianmainexperience/import")
    public String academicianmainexperienceServiceImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academicianmainexperienceService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academicianmainposition/import")
    public String academicianmainpositionImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academicianmainpositionService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academicianmajorachievements/import")
    public String academicianmajorachievementsImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academicianmajorachievementsService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academicianmajoreducation/import")
    public String academicianmajoreducationImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academicianmajoreducationService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academiciannationalcongress/import")
    public String academiciannationalcongressImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academiciannationalcongressService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academicianpatent/import")
    public String academicianpatentImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academicianpatentService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academiciansocialposition/import")
    public String academiciansocialpositionImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academiciansocialpositionService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academiciantechnologyawards/import")
    public String academiciantechnologyawardsImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academiciantechnologyawardsService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }

    @RequestMapping("/academicianthesismonographs/import")
    public String academicianthesismonographsImport(String pageNo, String pageSize){
        BaseBean bean = new BaseBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        academicianthesismonographsService.importInfo(pageNo, pageSize, bean);
        return "Complete";
    }
}
