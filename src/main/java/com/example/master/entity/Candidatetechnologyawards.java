package com.example.master.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Candidatetechnologyawards extends BaseBean implements Serializable {
    private String technologyawardsid;

    private String selectedyear;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String candidateid;

    private String candidateuuid;

    private Integer technologyawardssn;

    private String awardyear;

    private String awardname;

    private String awardlevel;

    private String awardtype;

    private String rank;

    private String certificatenumber;

    private String majorcontribution;

    private String majorcollaborators;

    private String relatedsituation;

    private String orgid;

    private String compid;

    private static final long serialVersionUID = 1L;

    public String getTechnologyawardsid() {
        return technologyawardsid;
    }

    public void setTechnologyawardsid(String technologyawardsid) {
        this.technologyawardsid = technologyawardsid == null ? null : technologyawardsid.trim();
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

    public Integer getTechnologyawardssn() {
        return technologyawardssn;
    }

    public void setTechnologyawardssn(Integer technologyawardssn) {
        this.technologyawardssn = technologyawardssn;
    }

    public String getAwardyear() {
        return awardyear;
    }

    public void setAwardyear(String awardyear) {
        this.awardyear = awardyear == null ? null : awardyear.trim();
    }

    public String getAwardname() {
        return awardname;
    }

    public void setAwardname(String awardname) {
        this.awardname = awardname == null ? null : awardname.trim();
    }

    public String getAwardlevel() {
        return awardlevel;
    }

    public void setAwardlevel(String awardlevel) {
        this.awardlevel = awardlevel == null ? null : awardlevel.trim();
    }

    public String getAwardtype() {
        return awardtype;
    }

    public void setAwardtype(String awardtype) {
        this.awardtype = awardtype == null ? null : awardtype.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getCertificatenumber() {
        return certificatenumber;
    }

    public void setCertificatenumber(String certificatenumber) {
        this.certificatenumber = certificatenumber == null ? null : certificatenumber.trim();
    }

    public String getMajorcontribution() {
        return majorcontribution;
    }

    public void setMajorcontribution(String majorcontribution) {
        this.majorcontribution = majorcontribution == null ? null : majorcontribution.trim();
    }

    public String getMajorcollaborators() {
        return majorcollaborators;
    }

    public void setMajorcollaborators(String majorcollaborators) {
        this.majorcollaborators = majorcollaborators == null ? null : majorcollaborators.trim();
    }

    public String getRelatedsituation() {
        return relatedsituation;
    }

    public void setRelatedsituation(String relatedsituation) {
        this.relatedsituation = relatedsituation == null ? null : relatedsituation.trim();
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
        sb.append(", technologyawardsid=").append(technologyawardsid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", candidateuuid=").append(candidateuuid);
        sb.append(", technologyawardssn=").append(technologyawardssn);
        sb.append(", awardyear=").append(awardyear);
        sb.append(", awardname=").append(awardname);
        sb.append(", awardlevel=").append(awardlevel);
        sb.append(", awardtype=").append(awardtype);
        sb.append(", rank=").append(rank);
        sb.append(", certificatenumber=").append(certificatenumber);
        sb.append(", majorcontribution=").append(majorcontribution);
        sb.append(", majorcollaborators=").append(majorcollaborators);
        sb.append(", relatedsituation=").append(relatedsituation);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}