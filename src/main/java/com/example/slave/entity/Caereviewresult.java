package com.example.slave.entity;

import java.io.Serializable;
import java.util.Date;

public class Caereviewresult implements Serializable {
    private String reviewresultid;

    private Integer status;

    private String errorreason;

    private String name;

    private String recepitnumber;

    private String reviewsureid;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private String candidateid;

    private static final long serialVersionUID = 1L;

    public String getReviewresultid() {
        return reviewresultid;
    }

    public void setReviewresultid(String reviewresultid) {
        this.reviewresultid = reviewresultid == null ? null : reviewresultid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getErrorreason() {
        return errorreason;
    }

    public void setErrorreason(String errorreason) {
        this.errorreason = errorreason == null ? null : errorreason.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRecepitnumber() {
        return recepitnumber;
    }

    public void setRecepitnumber(String recepitnumber) {
        this.recepitnumber = recepitnumber == null ? null : recepitnumber.trim();
    }

    public String getReviewsureid() {
        return reviewsureid;
    }

    public void setReviewsureid(String reviewsureid) {
        this.reviewsureid = reviewsureid == null ? null : reviewsureid.trim();
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
        sb.append(", reviewresultid=").append(reviewresultid);
        sb.append(", status=").append(status);
        sb.append(", errorreason=").append(errorreason);
        sb.append(", name=").append(name);
        sb.append(", recepitnumber=").append(recepitnumber);
        sb.append(", reviewsureid=").append(reviewsureid);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}