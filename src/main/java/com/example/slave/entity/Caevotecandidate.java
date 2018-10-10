package com.example.slave.entity;

import java.io.Serializable;
import java.util.Date;

public class Caevotecandidate implements Serializable {
    private String votecandidateid;

    private String selectyear;

    private String candidateid;

    private String departmentid;

    private String voteroundid;

    private String groupid;

    private Integer number;

    private Integer ispass;

    private String name;

    private String nominationnumber;

    private String createby;

    private String updateby;

    private Date createdt;

    private String receiptnumber;

    private Date updatedt;

    private String orgid;

    private String compid;

    private String voteid;

    private static final long serialVersionUID = 1L;

    public String getVotecandidateid() {
        return votecandidateid;
    }

    public void setVotecandidateid(String votecandidateid) {
        this.votecandidateid = votecandidateid == null ? null : votecandidateid.trim();
    }

    public String getSelectyear() {
        return selectyear;
    }

    public void setSelectyear(String selectyear) {
        this.selectyear = selectyear == null ? null : selectyear.trim();
    }

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid == null ? null : candidateid.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public String getVoteroundid() {
        return voteroundid;
    }

    public void setVoteroundid(String voteroundid) {
        this.voteroundid = voteroundid == null ? null : voteroundid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getIspass() {
        return ispass;
    }

    public void setIspass(Integer ispass) {
        this.ispass = ispass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNominationnumber() {
        return nominationnumber;
    }

    public void setNominationnumber(String nominationnumber) {
        this.nominationnumber = nominationnumber == null ? null : nominationnumber.trim();
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

    public String getReceiptnumber() {
        return receiptnumber;
    }

    public void setReceiptnumber(String receiptnumber) {
        this.receiptnumber = receiptnumber == null ? null : receiptnumber.trim();
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

    public String getVoteid() {
        return voteid;
    }

    public void setVoteid(String voteid) {
        this.voteid = voteid == null ? null : voteid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", votecandidateid=").append(votecandidateid);
        sb.append(", selectyear=").append(selectyear);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", voteroundid=").append(voteroundid);
        sb.append(", groupid=").append(groupid);
        sb.append(", number=").append(number);
        sb.append(", ispass=").append(ispass);
        sb.append(", name=").append(name);
        sb.append(", nominationnumber=").append(nominationnumber);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", receiptnumber=").append(receiptnumber);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", voteid=").append(voteid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}