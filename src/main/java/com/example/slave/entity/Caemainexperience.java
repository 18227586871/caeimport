package com.example.slave.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Caemainexperience extends BaseBean implements Serializable {
    private String mainexperienceid;

    private String academicianid;

    private String academicianuuid;

    private String originalposition;

    private String otherposition;

    private String county;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private String selectedyear;

    private String candidateid;

    private String candidateuuid;

    private Integer mainexperiencesn;

    private String starttime;

    private String endtime;

    private String department;

    private String administrativeduties;

    private String technicalposition;

    private String position;

    private static final long serialVersionUID = 1L;

    public String getMainexperienceid() {
        return mainexperienceid;
    }

    public void setMainexperienceid(String mainexperienceid) {
        this.mainexperienceid = mainexperienceid == null ? null : mainexperienceid.trim();
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

    public String getOriginalposition() {
        return originalposition;
    }

    public void setOriginalposition(String originalposition) {
        this.originalposition = originalposition == null ? null : originalposition.trim();
    }

    public String getOtherposition() {
        return otherposition;
    }

    public void setOtherposition(String otherposition) {
        this.otherposition = otherposition == null ? null : otherposition.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
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

    public String getCandidateuuid() {
        return candidateuuid;
    }

    public void setCandidateuuid(String candidateuuid) {
        this.candidateuuid = candidateuuid == null ? null : candidateuuid.trim();
    }

    public Integer getMainexperiencesn() {
        return mainexperiencesn;
    }

    public void setMainexperiencesn(Integer mainexperiencesn) {
        this.mainexperiencesn = mainexperiencesn;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getAdministrativeduties() {
        return administrativeduties;
    }

    public void setAdministrativeduties(String administrativeduties) {
        this.administrativeduties = administrativeduties == null ? null : administrativeduties.trim();
    }

    public String getTechnicalposition() {
        return technicalposition;
    }

    public void setTechnicalposition(String technicalposition) {
        this.technicalposition = technicalposition == null ? null : technicalposition.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mainexperienceid=").append(mainexperienceid);
        sb.append(", academicianid=").append(academicianid);
        sb.append(", academicianuuid=").append(academicianuuid);
        sb.append(", originalposition=").append(originalposition);
        sb.append(", otherposition=").append(otherposition);
        sb.append(", county=").append(county);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", candidateuuid=").append(candidateuuid);
        sb.append(", mainexperiencesn=").append(mainexperiencesn);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", department=").append(department);
        sb.append(", administrativeduties=").append(administrativeduties);
        sb.append(", technicalposition=").append(technicalposition);
        sb.append(", position=").append(position);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}