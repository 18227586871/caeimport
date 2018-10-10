package com.example.slave.entity;

import java.io.Serializable;
import java.util.Date;

public class Caevoteballotresult implements Serializable {
    private String voteballotresultid;

    private Date selectyear;

    private String voteballotid;

    private String candidateid;

    private Double score;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private static final long serialVersionUID = 1L;

    public String getVoteballotresultid() {
        return voteballotresultid;
    }

    public void setVoteballotresultid(String voteballotresultid) {
        this.voteballotresultid = voteballotresultid == null ? null : voteballotresultid.trim();
    }

    public Date getSelectyear() {
        return selectyear;
    }

    public void setSelectyear(Date selectyear) {
        this.selectyear = selectyear;
    }

    public String getVoteballotid() {
        return voteballotid;
    }

    public void setVoteballotid(String voteballotid) {
        this.voteballotid = voteballotid == null ? null : voteballotid.trim();
    }

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid == null ? null : candidateid.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
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
        sb.append(", voteballotresultid=").append(voteballotresultid);
        sb.append(", selectyear=").append(selectyear);
        sb.append(", voteballotid=").append(voteballotid);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", score=").append(score);
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