package com.example.slave.entity;

import java.io.Serializable;
import java.util.Date;

public class Caevote implements Serializable {
    private String voteid;

    private String votetitle;

    private Integer throughfraction;

    private Integer blankerrordeal;

    private Integer selectmoreerrordeal;

    private String selectyear;

    private Integer votestatus;

    private String departmentid;

    private String groupid;

    private String roundid;

    private Integer planacademiciannum;

    private Integer votetype;

    private Integer actualacademiciannum;

    private String createby;

    private Date createdt;

    private String updateby;

    private Date updatedt;

    private String orgid;

    private String compid;

    private Integer votesn;

    private static final long serialVersionUID = 1L;

    public String getVoteid() {
        return voteid;
    }

    public void setVoteid(String voteid) {
        this.voteid = voteid == null ? null : voteid.trim();
    }

    public String getVotetitle() {
        return votetitle;
    }

    public void setVotetitle(String votetitle) {
        this.votetitle = votetitle == null ? null : votetitle.trim();
    }

    public Integer getThroughfraction() {
        return throughfraction;
    }

    public void setThroughfraction(Integer throughfraction) {
        this.throughfraction = throughfraction;
    }

    public Integer getBlankerrordeal() {
        return blankerrordeal;
    }

    public void setBlankerrordeal(Integer blankerrordeal) {
        this.blankerrordeal = blankerrordeal;
    }

    public Integer getSelectmoreerrordeal() {
        return selectmoreerrordeal;
    }

    public void setSelectmoreerrordeal(Integer selectmoreerrordeal) {
        this.selectmoreerrordeal = selectmoreerrordeal;
    }

    public String getSelectyear() {
        return selectyear;
    }

    public void setSelectyear(String selectyear) {
        this.selectyear = selectyear == null ? null : selectyear.trim();
    }

    public Integer getVotestatus() {
        return votestatus;
    }

    public void setVotestatus(Integer votestatus) {
        this.votestatus = votestatus;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getRoundid() {
        return roundid;
    }

    public void setRoundid(String roundid) {
        this.roundid = roundid == null ? null : roundid.trim();
    }

    public Integer getPlanacademiciannum() {
        return planacademiciannum;
    }

    public void setPlanacademiciannum(Integer planacademiciannum) {
        this.planacademiciannum = planacademiciannum;
    }

    public Integer getVotetype() {
        return votetype;
    }

    public void setVotetype(Integer votetype) {
        this.votetype = votetype;
    }

    public Integer getActualacademiciannum() {
        return actualacademiciannum;
    }

    public void setActualacademiciannum(Integer actualacademiciannum) {
        this.actualacademiciannum = actualacademiciannum;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
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

    public Integer getVotesn() {
        return votesn;
    }

    public void setVotesn(Integer votesn) {
        this.votesn = votesn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voteid=").append(voteid);
        sb.append(", votetitle=").append(votetitle);
        sb.append(", throughfraction=").append(throughfraction);
        sb.append(", blankerrordeal=").append(blankerrordeal);
        sb.append(", selectmoreerrordeal=").append(selectmoreerrordeal);
        sb.append(", selectyear=").append(selectyear);
        sb.append(", votestatus=").append(votestatus);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", groupid=").append(groupid);
        sb.append(", roundid=").append(roundid);
        sb.append(", planacademiciannum=").append(planacademiciannum);
        sb.append(", votetype=").append(votetype);
        sb.append(", actualacademiciannum=").append(actualacademiciannum);
        sb.append(", createby=").append(createby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updateby=").append(updateby);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", votesn=").append(votesn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}