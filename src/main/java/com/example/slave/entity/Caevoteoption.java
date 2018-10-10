package com.example.slave.entity;

import java.io.Serializable;

public class Caevoteoption implements Serializable {
    private String voteoptionid;

    private String voteid;

    private String optiontitle;

    private Double optionscore;

    private Integer maxticked;

    private Integer upperlimit;

    private Integer lowerlimit;

    private Integer optionsn;

    private String voteballotid;

    private String voteroundid;

    private static final long serialVersionUID = 1L;

    public String getVoteoptionid() {
        return voteoptionid;
    }

    public void setVoteoptionid(String voteoptionid) {
        this.voteoptionid = voteoptionid == null ? null : voteoptionid.trim();
    }

    public String getVoteid() {
        return voteid;
    }

    public void setVoteid(String voteid) {
        this.voteid = voteid == null ? null : voteid.trim();
    }

    public String getOptiontitle() {
        return optiontitle;
    }

    public void setOptiontitle(String optiontitle) {
        this.optiontitle = optiontitle == null ? null : optiontitle.trim();
    }

    public Double getOptionscore() {
        return optionscore;
    }

    public void setOptionscore(Double optionscore) {
        this.optionscore = optionscore;
    }

    public Integer getMaxticked() {
        return maxticked;
    }

    public void setMaxticked(Integer maxticked) {
        this.maxticked = maxticked;
    }

    public Integer getUpperlimit() {
        return upperlimit;
    }

    public void setUpperlimit(Integer upperlimit) {
        this.upperlimit = upperlimit;
    }

    public Integer getLowerlimit() {
        return lowerlimit;
    }

    public void setLowerlimit(Integer lowerlimit) {
        this.lowerlimit = lowerlimit;
    }

    public Integer getOptionsn() {
        return optionsn;
    }

    public void setOptionsn(Integer optionsn) {
        this.optionsn = optionsn;
    }

    public String getVoteballotid() {
        return voteballotid;
    }

    public void setVoteballotid(String voteballotid) {
        this.voteballotid = voteballotid == null ? null : voteballotid.trim();
    }

    public String getVoteroundid() {
        return voteroundid;
    }

    public void setVoteroundid(String voteroundid) {
        this.voteroundid = voteroundid == null ? null : voteroundid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voteoptionid=").append(voteoptionid);
        sb.append(", voteid=").append(voteid);
        sb.append(", optiontitle=").append(optiontitle);
        sb.append(", optionscore=").append(optionscore);
        sb.append(", maxticked=").append(maxticked);
        sb.append(", upperlimit=").append(upperlimit);
        sb.append(", lowerlimit=").append(lowerlimit);
        sb.append(", optionsn=").append(optionsn);
        sb.append(", voteballotid=").append(voteballotid);
        sb.append(", voteroundid=").append(voteroundid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}