package com.example.master.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Academicianadditionalinfomation extends BaseBean implements Serializable {
    private String academicianid;

    private String academicianuuid;

    private String selectedyear;

    private Date createdt;

    private String createby;

    private Date updatedt;

    private String updateby;

    private String nominationreviewopinion;

    private String nominateunitopinion;

    private String selectdepartmentcomments;

    private String nominationacademicians;

    private String contributiondesc;

    private String orgid;

    private String compid;

    private static final long serialVersionUID = 1L;

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

    public String getSelectedyear() {
        return selectedyear;
    }

    public void setSelectedyear(String selectedyear) {
        this.selectedyear = selectedyear == null ? null : selectedyear.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(Date updatedt) {
        this.updatedt = updatedt;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public String getNominationreviewopinion() {
        return nominationreviewopinion;
    }

    public void setNominationreviewopinion(String nominationreviewopinion) {
        this.nominationreviewopinion = nominationreviewopinion == null ? null : nominationreviewopinion.trim();
    }

    public String getNominateunitopinion() {
        return nominateunitopinion;
    }

    public void setNominateunitopinion(String nominateunitopinion) {
        this.nominateunitopinion = nominateunitopinion == null ? null : nominateunitopinion.trim();
    }

    public String getSelectdepartmentcomments() {
        return selectdepartmentcomments;
    }

    public void setSelectdepartmentcomments(String selectdepartmentcomments) {
        this.selectdepartmentcomments = selectdepartmentcomments == null ? null : selectdepartmentcomments.trim();
    }

    public String getNominationacademicians() {
        return nominationacademicians;
    }

    public void setNominationacademicians(String nominationacademicians) {
        this.nominationacademicians = nominationacademicians == null ? null : nominationacademicians.trim();
    }

    public String getContributiondesc() {
        return contributiondesc;
    }

    public void setContributiondesc(String contributiondesc) {
        this.contributiondesc = contributiondesc == null ? null : contributiondesc.trim();
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
        sb.append(", academicianid=").append(academicianid);
        sb.append(", academicianuuid=").append(academicianuuid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", createdt=").append(createdt);
        sb.append(", createby=").append(createby);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", updateby=").append(updateby);
        sb.append(", nominationreviewopinion=").append(nominationreviewopinion);
        sb.append(", nominateunitopinion=").append(nominateunitopinion);
        sb.append(", selectdepartmentcomments=").append(selectdepartmentcomments);
        sb.append(", nominationacademicians=").append(nominationacademicians);
        sb.append(", contributiondesc=").append(contributiondesc);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}