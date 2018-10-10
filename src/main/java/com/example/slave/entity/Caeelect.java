package com.example.slave.entity;

import java.io.Serializable;
import java.util.Date;

public class Caeelect implements Serializable {
    private String electid;

    private String electtitle;

    private String groupid;

    private String departmentid;

    private String voteid;

    private String voteroundid;

    private Integer electstatus;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private static final long serialVersionUID = 1L;

    public String getElectid() {
        return electid;
    }

    public void setElectid(String electid) {
        this.electid = electid == null ? null : electid.trim();
    }

    public String getElecttitle() {
        return electtitle;
    }

    public void setElecttitle(String electtitle) {
        this.electtitle = electtitle == null ? null : electtitle.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public String getVoteid() {
        return voteid;
    }

    public void setVoteid(String voteid) {
        this.voteid = voteid == null ? null : voteid.trim();
    }

    public String getVoteroundid() {
        return voteroundid;
    }

    public void setVoteroundid(String voteroundid) {
        this.voteroundid = voteroundid == null ? null : voteroundid.trim();
    }

    public Integer getElectstatus() {
        return electstatus;
    }

    public void setElectstatus(Integer electstatus) {
        this.electstatus = electstatus;
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
        sb.append(", electid=").append(electid);
        sb.append(", electtitle=").append(electtitle);
        sb.append(", groupid=").append(groupid);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", voteid=").append(voteid);
        sb.append(", voteroundid=").append(voteroundid);
        sb.append(", electstatus=").append(electstatus);
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