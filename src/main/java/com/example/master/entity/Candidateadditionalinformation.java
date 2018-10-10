package com.example.master.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Candidateadditionalinformation extends BaseBean implements Serializable {
    private String candidateid;

    private String candidateuuid;

    private String selectedyear;

    private String createby;

    private Date createdt;

    private String updateby;

    private Date updatedt;

    private String nominationreviewopinion;

    private String nominateunitopinion;

    private String selectdepartmentcomments;

    private String nominationacademicians;

    private String contributiondesc;

    private String opinionbarcode;

    private String recommendedunitopinion;

    private String recommendedbarcode;

    private String selectbarcode;

    private String unitauditopinion;

    private String unitbarcode;

    private String orgid;

    private String compid;

    private static final long serialVersionUID = 1L;

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid == null ? null : candidateid.trim();
    }

    public String getCandidateuuid() {
        return candidateuuid;
    }

    public void setCandidateuuid(String candidateuuid) {
        this.candidateuuid = candidateuuid == null ? null : candidateuuid.trim();
    }

    public String getSelectedyear() {
        return selectedyear;
    }

    public void setSelectedyear(String selectedyear) {
        this.selectedyear = selectedyear == null ? null : selectedyear.trim();
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Date getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(Date updatedt) {
        this.updatedt = updatedt;
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

    public String getOpinionbarcode() {
        return opinionbarcode;
    }

    public void setOpinionbarcode(String opinionbarcode) {
        this.opinionbarcode = opinionbarcode == null ? null : opinionbarcode.trim();
    }

    public String getRecommendedunitopinion() {
        return recommendedunitopinion;
    }

    public void setRecommendedunitopinion(String recommendedunitopinion) {
        this.recommendedunitopinion = recommendedunitopinion == null ? null : recommendedunitopinion.trim();
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

    public String getUnitauditopinion() {
        return unitauditopinion;
    }

    public void setUnitauditopinion(String unitauditopinion) {
        this.unitauditopinion = unitauditopinion == null ? null : unitauditopinion.trim();
    }

    public String getUnitbarcode() {
        return unitbarcode;
    }

    public void setUnitbarcode(String unitbarcode) {
        this.unitbarcode = unitbarcode == null ? null : unitbarcode.trim();
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
        sb.append(", candidateid=").append(candidateid);
        sb.append(", candidateuuid=").append(candidateuuid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", createby=").append(createby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updateby=").append(updateby);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", nominationreviewopinion=").append(nominationreviewopinion);
        sb.append(", nominateunitopinion=").append(nominateunitopinion);
        sb.append(", selectdepartmentcomments=").append(selectdepartmentcomments);
        sb.append(", nominationacademicians=").append(nominationacademicians);
        sb.append(", contributiondesc=").append(contributiondesc);
        sb.append(", opinionbarcode=").append(opinionbarcode);
        sb.append(", recommendedunitopinion=").append(recommendedunitopinion);
        sb.append(", recommendedbarcode=").append(recommendedbarcode);
        sb.append(", selectbarcode=").append(selectbarcode);
        sb.append(", unitauditopinion=").append(unitauditopinion);
        sb.append(", unitbarcode=").append(unitbarcode);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}