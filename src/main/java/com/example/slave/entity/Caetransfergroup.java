package com.example.slave.entity;

import java.io.Serializable;
import java.util.Date;

public class Caetransfergroup implements Serializable {
    private String transfergroupid;

    private String transferintodepartmentid;

    private String transferintogroupid;

    private String transferoutdepartmentid;

    private String transferoutgroupid;

    private String selectedyear;

    private String candidateid;

    private String transferintonumber;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private String iseffective;

    private String transfertime;

    private static final long serialVersionUID = 1L;

    public String getTransfergroupid() {
        return transfergroupid;
    }

    public void setTransfergroupid(String transfergroupid) {
        this.transfergroupid = transfergroupid == null ? null : transfergroupid.trim();
    }

    public String getTransferintodepartmentid() {
        return transferintodepartmentid;
    }

    public void setTransferintodepartmentid(String transferintodepartmentid) {
        this.transferintodepartmentid = transferintodepartmentid == null ? null : transferintodepartmentid.trim();
    }

    public String getTransferintogroupid() {
        return transferintogroupid;
    }

    public void setTransferintogroupid(String transferintogroupid) {
        this.transferintogroupid = transferintogroupid == null ? null : transferintogroupid.trim();
    }

    public String getTransferoutdepartmentid() {
        return transferoutdepartmentid;
    }

    public void setTransferoutdepartmentid(String transferoutdepartmentid) {
        this.transferoutdepartmentid = transferoutdepartmentid == null ? null : transferoutdepartmentid.trim();
    }

    public String getTransferoutgroupid() {
        return transferoutgroupid;
    }

    public void setTransferoutgroupid(String transferoutgroupid) {
        this.transferoutgroupid = transferoutgroupid == null ? null : transferoutgroupid.trim();
    }

    public String getSelectedyear() {
        return selectedyear;
    }

    public void setSelectedyear(String selectedyear) {
        this.selectedyear = selectedyear == null ? null : selectedyear.trim();
    }

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid == null ? null : candidateid.trim();
    }

    public String getTransferintonumber() {
        return transferintonumber;
    }

    public void setTransferintonumber(String transferintonumber) {
        this.transferintonumber = transferintonumber == null ? null : transferintonumber.trim();
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

    public String getIseffective() {
        return iseffective;
    }

    public void setIseffective(String iseffective) {
        this.iseffective = iseffective == null ? null : iseffective.trim();
    }

    public String getTransfertime() {
        return transfertime;
    }

    public void setTransfertime(String transfertime) {
        this.transfertime = transfertime == null ? null : transfertime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transfergroupid=").append(transfergroupid);
        sb.append(", transferintodepartmentid=").append(transferintodepartmentid);
        sb.append(", transferintogroupid=").append(transferintogroupid);
        sb.append(", transferoutdepartmentid=").append(transferoutdepartmentid);
        sb.append(", transferoutgroupid=").append(transferoutgroupid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", transferintonumber=").append(transferintonumber);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", iseffective=").append(iseffective);
        sb.append(", transfertime=").append(transfertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}