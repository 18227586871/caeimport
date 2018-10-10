package com.example.slave.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Caeadditionalinformation extends BaseBean implements Serializable {
    private String additionalinformationid;

    private String opinionbarcode;

    private String selectedyear;

    private String candidateuuid;

    private String candidateid;

    private String photo;

    private String recommendedunitopinion;

    private String majordocument;

    private String recommendedbarcode;

    private String selectbarcode;

    private String nominationreviewopinion;

    private String unitauditopinion;

    private String nominateunitopinion;

    private String unitbarcode;

    private String selectdepartmentcomments;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private String nominationacademicians;

    private String academicianid;

    private String academicianuuid;

    private String contributiondesc;

    private String attachmentlevel;

    private String attachmentsnumber;

    private static final long serialVersionUID = 1L;

    public String getAdditionalinformationid() {
        return additionalinformationid;
    }

    public void setAdditionalinformationid(String additionalinformationid) {
        this.additionalinformationid = additionalinformationid == null ? null : additionalinformationid.trim();
    }

    public String getOpinionbarcode() {
        return opinionbarcode;
    }

    public void setOpinionbarcode(String opinionbarcode) {
        this.opinionbarcode = opinionbarcode == null ? null : opinionbarcode.trim();
    }

    public String getSelectedyear() {
        return selectedyear;
    }

    public void setSelectedyear(String selectedyear) {
        this.selectedyear = selectedyear == null ? null : selectedyear.trim();
    }

    public String getCandidateuuid() {
        return candidateuuid;
    }

    public void setCandidateuuid(String candidateuuid) {
        this.candidateuuid = candidateuuid == null ? null : candidateuuid.trim();
    }

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid == null ? null : candidateid.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getRecommendedunitopinion() {
        return recommendedunitopinion;
    }

    public void setRecommendedunitopinion(String recommendedunitopinion) {
        this.recommendedunitopinion = recommendedunitopinion == null ? null : recommendedunitopinion.trim();
    }

    public String getMajordocument() {
        return majordocument;
    }

    public void setMajordocument(String majordocument) {
        this.majordocument = majordocument == null ? null : majordocument.trim();
    }

    public String getRecommendedbarcode() {
        return recommendedbarcode;
    }

    public void setRecommendedbarcode(String recommendedbarcode) {
        this.recommendedbarcode = recommendedbarcode == null ? null : recommendedbarcode.trim();
    }

    public String getSelectbarcode() {
        return selectbarcode;
    }

    public void setSelectbarcode(String selectbarcode) {
        this.selectbarcode = selectbarcode == null ? null : selectbarcode.trim();
    }

    public String getNominationreviewopinion() {
        return nominationreviewopinion;
    }

    public void setNominationreviewopinion(String nominationreviewopinion) {
        this.nominationreviewopinion = nominationreviewopinion == null ? null : nominationreviewopinion.trim();
    }

    public String getUnitauditopinion() {
        return unitauditopinion;
    }

    public void setUnitauditopinion(String unitauditopinion) {
        this.unitauditopinion = unitauditopinion == null ? null : unitauditopinion.trim();
    }

    public String getNominateunitopinion() {
        return nominateunitopinion;
    }

    public void setNominateunitopinion(String nominateunitopinion) {
        this.nominateunitopinion = nominateunitopinion == null ? null : nominateunitopinion.trim();
    }

    public String getUnitbarcode() {
        return unitbarcode;
    }

    public void setUnitbarcode(String unitbarcode) {
        this.unitbarcode = unitbarcode == null ? null : unitbarcode.trim();
    }

    public String getSelectdepartmentcomments() {
        return selectdepartmentcomments;
    }

    public void setSelectdepartmentcomments(String selectdepartmentcomments) {
        this.selectdepartmentcomments = selectdepartmentcomments == null ? null : selectdepartmentcomments.trim();
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

    public String getNominationacademicians() {
        return nominationacademicians;
    }

    public void setNominationacademicians(String nominationacademicians) {
        this.nominationacademicians = nominationacademicians == null ? null : nominationacademicians.trim();
    }

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

    public String getContributiondesc() {
        return contributiondesc;
    }

    public void setContributiondesc(String contributiondesc) {
        this.contributiondesc = contributiondesc == null ? null : contributiondesc.trim();
    }

    public String getAttachmentlevel() {
        return attachmentlevel;
    }

    public void setAttachmentlevel(String attachmentlevel) {
        this.attachmentlevel = attachmentlevel == null ? null : attachmentlevel.trim();
    }

    public String getAttachmentsnumber() {
        return attachmentsnumber;
    }

    public void setAttachmentsnumber(String attachmentsnumber) {
        this.attachmentsnumber = attachmentsnumber == null ? null : attachmentsnumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", additionalinformationid=").append(additionalinformationid);
        sb.append(", opinionbarcode=").append(opinionbarcode);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", candidateuuid=").append(candidateuuid);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", photo=").append(photo);
        sb.append(", recommendedunitopinion=").append(recommendedunitopinion);
        sb.append(", majordocument=").append(majordocument);
        sb.append(", recommendedbarcode=").append(recommendedbarcode);
        sb.append(", selectbarcode=").append(selectbarcode);
        sb.append(", nominationreviewopinion=").append(nominationreviewopinion);
        sb.append(", unitauditopinion=").append(unitauditopinion);
        sb.append(", nominateunitopinion=").append(nominateunitopinion);
        sb.append(", unitbarcode=").append(unitbarcode);
        sb.append(", selectdepartmentcomments=").append(selectdepartmentcomments);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", nominationacademicians=").append(nominationacademicians);
        sb.append(", academicianid=").append(academicianid);
        sb.append(", academicianuuid=").append(academicianuuid);
        sb.append(", contributiondesc=").append(contributiondesc);
        sb.append(", attachmentlevel=").append(attachmentlevel);
        sb.append(", attachmentsnumber=").append(attachmentsnumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}