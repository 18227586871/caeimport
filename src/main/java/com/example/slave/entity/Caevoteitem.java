package com.example.slave.entity;

import java.io.Serializable;

public class Caevoteitem implements Serializable {
    private String voteitemid;

    private String candidateid;

    private String candidatename;

    private String voteid;

    private String optionname;

    private String showcolumnname;

    private String showcolumnvalue;

    private static final long serialVersionUID = 1L;

    public String getVoteitemid() {
        return voteitemid;
    }

    public void setVoteitemid(String voteitemid) {
        this.voteitemid = voteitemid == null ? null : voteitemid.trim();
    }

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid == null ? null : candidateid.trim();
    }

    public String getCandidatename() {
        return candidatename;
    }

    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename == null ? null : candidatename.trim();
    }

    public String getVoteid() {
        return voteid;
    }

    public void setVoteid(String voteid) {
        this.voteid = voteid == null ? null : voteid.trim();
    }

    public String getOptionname() {
        return optionname;
    }

    public void setOptionname(String optionname) {
        this.optionname = optionname == null ? null : optionname.trim();
    }

    public String getShowcolumnname() {
        return showcolumnname;
    }

    public void setShowcolumnname(String showcolumnname) {
        this.showcolumnname = showcolumnname == null ? null : showcolumnname.trim();
    }

    public String getShowcolumnvalue() {
        return showcolumnvalue;
    }

    public void setShowcolumnvalue(String showcolumnvalue) {
        this.showcolumnvalue = showcolumnvalue == null ? null : showcolumnvalue.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voteitemid=").append(voteitemid);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", candidatename=").append(candidatename);
        sb.append(", voteid=").append(voteid);
        sb.append(", optionname=").append(optionname);
        sb.append(", showcolumnname=").append(showcolumnname);
        sb.append(", showcolumnvalue=").append(showcolumnvalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}