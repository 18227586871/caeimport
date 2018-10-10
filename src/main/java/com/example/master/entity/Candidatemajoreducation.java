package com.example.master.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Candidatemajoreducation extends BaseBean implements Serializable {
    private String majoreducationid;

    private String selectedyear;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String candidateid;

    private String candidateuuid;

    private Integer majoreducationsn;

    private String starttime;

    private String endtime;

    private String school;

    private String major;

    private String degree;

    private String academic;

    private String originaldegree;

    private String originalacademic;

    private String otherdegree;

    private String otheracademic;

    private String country;

    private String orgid;

    private String compid;

    private String majoreducation;

    private static final long serialVersionUID = 1L;

    public String getMajoreducationid() {
        return majoreducationid;
    }

    public void setMajoreducationid(String majoreducationid) {
        this.majoreducationid = majoreducationid == null ? null : majoreducationid.trim();
    }

    public String getSelectedyear() {
        return selectedyear;
    }

    public void setSelectedyear(String selectedyear) {
        this.selectedyear = selectedyear == null ? null : selectedyear.trim();
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public Date getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(Date updatedt) {
        this.updatedt = updatedt;
    }

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid == null ? null : candidateid.trim();
    }

    public String getCandidateuuid() {
        return candidateuuid;
    }

    public void setCandidateuuid(String candidateuuid) {
        this.candidateuuid = candidateuuid == null ? null : candidateuuid.trim();
    }

    public Integer getMajoreducationsn() {
        return majoreducationsn;
    }

    public void setMajoreducationsn(Integer majoreducationsn) {
        this.majoreducationsn = majoreducationsn;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic == null ? null : academic.trim();
    }

    public String getOriginaldegree() {
        return originaldegree;
    }

    public void setOriginaldegree(String originaldegree) {
        this.originaldegree = originaldegree == null ? null : originaldegree.trim();
    }

    public String getOriginalacademic() {
        return originalacademic;
    }

    public void setOriginalacademic(String originalacademic) {
        this.originalacademic = originalacademic == null ? null : originalacademic.trim();
    }

    public String getOtherdegree() {
        return otherdegree;
    }

    public void setOtherdegree(String otherdegree) {
        this.otherdegree = otherdegree == null ? null : otherdegree.trim();
    }

    public String getOtheracademic() {
        return otheracademic;
    }

    public void setOtheracademic(String otheracademic) {
        this.otheracademic = otheracademic == null ? null : otheracademic.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid == null ? null : compid.trim();
    }

    public String getMajoreducation() {
        return majoreducation;
    }

    public void setMajoreducation(String majoreducation) {
        this.majoreducation = majoreducation == null ? null : majoreducation.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", majoreducationid=").append(majoreducationid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", candidateuuid=").append(candidateuuid);
        sb.append(", majoreducationsn=").append(majoreducationsn);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", school=").append(school);
        sb.append(", major=").append(major);
        sb.append(", degree=").append(degree);
        sb.append(", academic=").append(academic);
        sb.append(", originaldegree=").append(originaldegree);
        sb.append(", originalacademic=").append(originalacademic);
        sb.append(", otherdegree=").append(otherdegree);
        sb.append(", otheracademic=").append(otheracademic);
        sb.append(", country=").append(country);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", majoreducation=").append(majoreducation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}