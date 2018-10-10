package com.example.slave.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Caepatent extends BaseBean implements Serializable {
    private String patentid;

    private Integer patentsn;

    private String year;

    private String name;

    private String patentno;

    private String patenttype;

    private String inventor;

    private String majorcollaborators;

    private String academicianid;

    private String academicianuuid;

    private String rank;

    private String maineffect;

    private String maincontribution;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private String selectedyear;

    private String candidateuuid;

    private String candidateid;

    private static final long serialVersionUID = 1L;

    public String getPatentid() {
        return patentid;
    }

    public void setPatentid(String patentid) {
        this.patentid = patentid == null ? null : patentid.trim();
    }

    public Integer getPatentsn() {
        return patentsn;
    }

    public void setPatentsn(Integer patentsn) {
        this.patentsn = patentsn;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPatentno() {
        return patentno;
    }

    public void setPatentno(String patentno) {
        this.patentno = patentno == null ? null : patentno.trim();
    }

    public String getPatenttype() {
        return patenttype;
    }

    public void setPatenttype(String patenttype) {
        this.patenttype = patenttype == null ? null : patenttype.trim();
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor == null ? null : inventor.trim();
    }

    public String getMajorcollaborators() {
        return majorcollaborators;
    }

    public void setMajorcollaborators(String majorcollaborators) {
        this.majorcollaborators = majorcollaborators == null ? null : majorcollaborators.trim();
    }

    public String getAcademicianid() {
        return academicianid;
    }

    public void setAcademicianid(String academicianid) {
        this.academicianid = academicianid == null ? null : academicianid.trim();
    }

    public String getAcademicianuuid() {
        return academicianuuid;
    }

    public void setAcademicianuuid(String academicianuuid) {
        this.academicianuuid = academicianuuid == null ? null : academicianuuid.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getMaineffect() {
        return maineffect;
    }

    public void setMaineffect(String maineffect) {
        this.maineffect = maineffect == null ? null : maineffect.trim();
    }

    public String getMaincontribution() {
        return maincontribution;
    }

    public void setMaincontribution(String maincontribution) {
        this.maincontribution = maincontribution == null ? null : maincontribution.trim();
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

    public String getSelectedyear() {
        return selectedyear;
    }

    public void setSelectedyear(String selectedyear) {
        this.selectedyear = selectedyear == null ? null : selectedyear.trim();
    }

    public String getCandidateuuid() {
        return candidateuuid;
    }

    public void setCandidateuuid(String candidateuuid) {
        this.candidateuuid = candidateuuid == null ? null : candidateuuid.trim();
    }

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid == null ? null : candidateid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patentid=").append(patentid);
        sb.append(", patentsn=").append(patentsn);
        sb.append(", year=").append(year);
        sb.append(", name=").append(name);
        sb.append(", patentno=").append(patentno);
        sb.append(", patenttype=").append(patenttype);
        sb.append(", inventor=").append(inventor);
        sb.append(", majorcollaborators=").append(majorcollaborators);
        sb.append(", academicianid=").append(academicianid);
        sb.append(", academicianuuid=").append(academicianuuid);
        sb.append(", rank=").append(rank);
        sb.append(", maineffect=").append(maineffect);
        sb.append(", maincontribution=").append(maincontribution);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", candidateuuid=").append(candidateuuid);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}