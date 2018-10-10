package com.example.slave.entity;

import java.io.Serializable;

public class Caebusinessmode implements Serializable {
    private String busimodeid;

    private Integer pagenum;

    private String ballottypeid;

    private String ballotname;

    private static final long serialVersionUID = 1L;

    public String getBusimodeid() {
        return busimodeid;
    }

    public void setBusimodeid(String busimodeid) {
        this.busimodeid = busimodeid == null ? null : busimodeid.trim();
    }

    public Integer getPagenum() {
        return pagenum;
    }

    public void setPagenum(Integer pagenum) {
        this.pagenum = pagenum;
    }

    public String getBallottypeid() {
        return ballottypeid;
    }

    public void setBallottypeid(String ballottypeid) {
        this.ballottypeid = ballottypeid == null ? null : ballottypeid.trim();
    }

    public String getBallotname() {
        return ballotname;
    }

    public void setBallotname(String ballotname) {
        this.ballotname = ballotname == null ? null : ballotname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", busimodeid=").append(busimodeid);
        sb.append(", pagenum=").append(pagenum);
        sb.append(", ballottypeid=").append(ballottypeid);
        sb.append(", ballotname=").append(ballotname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}