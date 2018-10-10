package com.example.slave.entity;

import java.io.Serializable;
import java.util.Date;

public class Caevoteballot implements Serializable {
    private String voteballotid;

    private Integer throughfraction;

    private Integer blankerrordeal;

    private Integer selectmoreerrordeal;

    private Date selectyear;

    private Integer status;

    private String departmentid;

    private String groupid;

    private String roundid;

    private Integer planacademiciannum;

    private Integer type;

    private Integer actualacademiciannum;

    private static final long serialVersionUID = 1L;

    public String getVoteballotid() {
        return voteballotid;
    }

    public void setVoteballotid(String voteballotid) {
        this.voteballotid = voteballotid == null ? null : voteballotid.trim();
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

    public Date getSelectyear() {
        return selectyear;
    }

    public void setSelectyear(Date selectyear) {
        this.selectyear = selectyear;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getActualacademiciannum() {
        return actualacademiciannum;
    }

    public void setActualacademiciannum(Integer actualacademiciannum) {
        this.actualacademiciannum = actualacademiciannum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voteballotid=").append(voteballotid);
        sb.append(", throughfraction=").append(throughfraction);
        sb.append(", blankerrordeal=").append(blankerrordeal);
        sb.append(", selectmoreerrordeal=").append(selectmoreerrordeal);
        sb.append(", selectyear=").append(selectyear);
        sb.append(", status=").append(status);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", groupid=").append(groupid);
        sb.append(", roundid=").append(roundid);
        sb.append(", planacademiciannum=").append(planacademiciannum);
        sb.append(", type=").append(type);
        sb.append(", actualacademiciannum=").append(actualacademiciannum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}