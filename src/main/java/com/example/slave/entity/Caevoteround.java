package com.example.slave.entity;

import java.io.Serializable;
import java.util.Date;

public class Caevoteround implements Serializable {
    private String voteroundid;

    private String roundtitle;

    private Date selectyear;

    private String departmentid;

    private Integer roundsn;

    private Integer throughnum;

    private Integer voteroundstatus;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private static final long serialVersionUID = 1L;

    public String getVoteroundid() {
        return voteroundid;
    }

    public void setVoteroundid(String voteroundid) {
        this.voteroundid = voteroundid == null ? null : voteroundid.trim();
    }

    public String getRoundtitle() {
        return roundtitle;
    }

    public void setRoundtitle(String roundtitle) {
        this.roundtitle = roundtitle == null ? null : roundtitle.trim();
    }

    public Date getSelectyear() {
        return selectyear;
    }

    public void setSelectyear(Date selectyear) {
        this.selectyear = selectyear;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public Integer getRoundsn() {
        return roundsn;
    }

    public void setRoundsn(Integer roundsn) {
        this.roundsn = roundsn;
    }

    public Integer getThroughnum() {
        return throughnum;
    }

    public void setThroughnum(Integer throughnum) {
        this.throughnum = throughnum;
    }

    public Integer getVoteroundstatus() {
        return voteroundstatus;
    }

    public void setVoteroundstatus(Integer voteroundstatus) {
        this.voteroundstatus = voteroundstatus;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voteroundid=").append(voteroundid);
        sb.append(", roundtitle=").append(roundtitle);
        sb.append(", selectyear=").append(selectyear);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", roundsn=").append(roundsn);
        sb.append(", throughnum=").append(throughnum);
        sb.append(", voteroundstatus=").append(voteroundstatus);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}