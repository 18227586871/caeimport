package com.example.slave.entity;

import java.io.Serializable;
import java.util.Date;

public class Caeennualelectionrules implements Serializable {
    private String ennualelectionrulesid;

    private Date overagecalculationtime;

    private Integer foreignmaxreceiptnumber;

    private String selectyear;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private Integer maxreceiptnumber;

    private Date receiptendtime;

    private Date agecalculationtime;

    private Integer foreignneednumber;

    private Integer maxnominatesforeignnumber;

    private Integer seventycandidatefrequency;

    private Integer candidatecontinuousnumber;

    private static final long serialVersionUID = 1L;

    public String getEnnualelectionrulesid() {
        return ennualelectionrulesid;
    }

    public void setEnnualelectionrulesid(String ennualelectionrulesid) {
        this.ennualelectionrulesid = ennualelectionrulesid == null ? null : ennualelectionrulesid.trim();
    }

    public Date getOveragecalculationtime() {
        return overagecalculationtime;
    }

    public void setOveragecalculationtime(Date overagecalculationtime) {
        this.overagecalculationtime = overagecalculationtime;
    }

    public Integer getForeignmaxreceiptnumber() {
        return foreignmaxreceiptnumber;
    }

    public void setForeignmaxreceiptnumber(Integer foreignmaxreceiptnumber) {
        this.foreignmaxreceiptnumber = foreignmaxreceiptnumber;
    }

    public String getSelectyear() {
        return selectyear;
    }

    public void setSelectyear(String selectyear) {
        this.selectyear = selectyear == null ? null : selectyear.trim();
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

    public Integer getMaxreceiptnumber() {
        return maxreceiptnumber;
    }

    public void setMaxreceiptnumber(Integer maxreceiptnumber) {
        this.maxreceiptnumber = maxreceiptnumber;
    }

    public Date getReceiptendtime() {
        return receiptendtime;
    }

    public void setReceiptendtime(Date receiptendtime) {
        this.receiptendtime = receiptendtime;
    }

    public Date getAgecalculationtime() {
        return agecalculationtime;
    }

    public void setAgecalculationtime(Date agecalculationtime) {
        this.agecalculationtime = agecalculationtime;
    }

    public Integer getForeignneednumber() {
        return foreignneednumber;
    }

    public void setForeignneednumber(Integer foreignneednumber) {
        this.foreignneednumber = foreignneednumber;
    }

    public Integer getMaxnominatesforeignnumber() {
        return maxnominatesforeignnumber;
    }

    public void setMaxnominatesforeignnumber(Integer maxnominatesforeignnumber) {
        this.maxnominatesforeignnumber = maxnominatesforeignnumber;
    }

    public Integer getSeventycandidatefrequency() {
        return seventycandidatefrequency;
    }

    public void setSeventycandidatefrequency(Integer seventycandidatefrequency) {
        this.seventycandidatefrequency = seventycandidatefrequency;
    }

    public Integer getCandidatecontinuousnumber() {
        return candidatecontinuousnumber;
    }

    public void setCandidatecontinuousnumber(Integer candidatecontinuousnumber) {
        this.candidatecontinuousnumber = candidatecontinuousnumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ennualelectionrulesid=").append(ennualelectionrulesid);
        sb.append(", overagecalculationtime=").append(overagecalculationtime);
        sb.append(", foreignmaxreceiptnumber=").append(foreignmaxreceiptnumber);
        sb.append(", selectyear=").append(selectyear);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", maxreceiptnumber=").append(maxreceiptnumber);
        sb.append(", receiptendtime=").append(receiptendtime);
        sb.append(", agecalculationtime=").append(agecalculationtime);
        sb.append(", foreignneednumber=").append(foreignneednumber);
        sb.append(", maxnominatesforeignnumber=").append(maxnominatesforeignnumber);
        sb.append(", seventycandidatefrequency=").append(seventycandidatefrequency);
        sb.append(", candidatecontinuousnumber=").append(candidatecontinuousnumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}