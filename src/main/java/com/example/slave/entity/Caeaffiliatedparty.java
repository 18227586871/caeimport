package com.example.slave.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Caeaffiliatedparty extends BaseBean implements Serializable {
    private String affiliatedpartyid;

    private String academicianid;

    private String academicianuuid;

    private String selectedyear;

    private String candidateid;

    private String candidateuuid;

    private Integer affiliatedpartysn;

    private String partisan;

    private String name;

    private String partypositions;

    private String participationdate;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private String endtime;

    private String starttime;

    private static final long serialVersionUID = 1L;

    public String getAffiliatedpartyid() {
        return affiliatedpartyid;
    }

    public void setAffiliatedpartyid(String affiliatedpartyid) {
        this.affiliatedpartyid = affiliatedpartyid == null ? null : affiliatedpartyid.trim();
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

    public Integer getAffiliatedpartysn() {
        return affiliatedpartysn;
    }

    public void setAffiliatedpartysn(Integer affiliatedpartysn) {
        this.affiliatedpartysn = affiliatedpartysn;
    }

    public String getPartisan() {
        return partisan;
    }

    public void setPartisan(String partisan) {
        this.partisan = partisan == null ? null : partisan.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPartypositions() {
        return partypositions;
    }

    public void setPartypositions(String partypositions) {
        this.partypositions = partypositions == null ? null : partypositions.trim();
    }

    public String getParticipationdate() {
        return participationdate;
    }

    public void setParticipationdate(String participationdate) {
        this.participationdate = participationdate == null ? null : participationdate.trim();
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

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", affiliatedpartyid=").append(affiliatedpartyid);
        sb.append(", academicianid=").append(academicianid);
        sb.append(", academicianuuid=").append(academicianuuid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", candidateuuid=").append(candidateuuid);
        sb.append(", affiliatedpartysn=").append(affiliatedpartysn);
        sb.append(", partisan=").append(partisan);
        sb.append(", name=").append(name);
        sb.append(", partypositions=").append(partypositions);
        sb.append(", participationdate=").append(participationdate);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", endtime=").append(endtime);
        sb.append(", starttime=").append(starttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}