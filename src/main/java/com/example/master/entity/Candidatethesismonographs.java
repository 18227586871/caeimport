package com.example.master.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Candidatethesismonographs extends BaseBean implements Serializable {
    private String thesismonographsid;

    private String selectedyear;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String candidateid;

    private String candidateuuid;

    private Integer thesismonographssn;

    private String publishedyear;

    private String workname;

    private String rank;

    private String majorcollaborators;

    private String publications;

    private String relatedsituation;

    private String majorcontribution;

    private String correspondingauthor;

    private String firstauthor;

    private String orgid;

    private String compid;

    private static final long serialVersionUID = 1L;

    public String getThesismonographsid() {
        return thesismonographsid;
    }

    public void setThesismonographsid(String thesismonographsid) {
        this.thesismonographsid = thesismonographsid == null ? null : thesismonographsid.trim();
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

    public Integer getThesismonographssn() {
        return thesismonographssn;
    }

    public void setThesismonographssn(Integer thesismonographssn) {
        this.thesismonographssn = thesismonographssn;
    }

    public String getPublishedyear() {
        return publishedyear;
    }

    public void setPublishedyear(String publishedyear) {
        this.publishedyear = publishedyear == null ? null : publishedyear.trim();
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname == null ? null : workname.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getMajorcollaborators() {
        return majorcollaborators;
    }

    public void setMajorcollaborators(String majorcollaborators) {
        this.majorcollaborators = majorcollaborators == null ? null : majorcollaborators.trim();
    }

    public String getPublications() {
        return publications;
    }

    public void setPublications(String publications) {
        this.publications = publications == null ? null : publications.trim();
    }

    public String getRelatedsituation() {
        return relatedsituation;
    }

    public void setRelatedsituation(String relatedsituation) {
        this.relatedsituation = relatedsituation == null ? null : relatedsituation.trim();
    }

    public String getMajorcontribution() {
        return majorcontribution;
    }

    public void setMajorcontribution(String majorcontribution) {
        this.majorcontribution = majorcontribution == null ? null : majorcontribution.trim();
    }

    public String getCorrespondingauthor() {
        return correspondingauthor;
    }

    public void setCorrespondingauthor(String correspondingauthor) {
        this.correspondingauthor = correspondingauthor == null ? null : correspondingauthor.trim();
    }

    public String getFirstauthor() {
        return firstauthor;
    }

    public void setFirstauthor(String firstauthor) {
        this.firstauthor = firstauthor == null ? null : firstauthor.trim();
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
        sb.append(", thesismonographsid=").append(thesismonographsid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", candidateuuid=").append(candidateuuid);
        sb.append(", thesismonographssn=").append(thesismonographssn);
        sb.append(", publishedyear=").append(publishedyear);
        sb.append(", workname=").append(workname);
        sb.append(", rank=").append(rank);
        sb.append(", majorcollaborators=").append(majorcollaborators);
        sb.append(", publications=").append(publications);
        sb.append(", relatedsituation=").append(relatedsituation);
        sb.append(", majorcontribution=").append(majorcontribution);
        sb.append(", correspondingauthor=").append(correspondingauthor);
        sb.append(", firstauthor=").append(firstauthor);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}