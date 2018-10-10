package com.example.slave.entity;

import java.io.Serializable;

public class Caevotedisplayitem implements Serializable {
    private String displayitemid;

    private Integer sn;

    private String title;

    private String type;

    private String voteid;

    private static final long serialVersionUID = 1L;

    public String getDisplayitemid() {
        return displayitemid;
    }

    public void setDisplayitemid(String displayitemid) {
        this.displayitemid = displayitemid == null ? null : displayitemid.trim();
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getVoteid() {
        return voteid;
    }

    public void setVoteid(String voteid) {
        this.voteid = voteid == null ? null : voteid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", displayitemid=").append(displayitemid);
        sb.append(", sn=").append(sn);
        sb.append(", title=").append(title);
        sb.append(", type=").append(type);
        sb.append(", voteid=").append(voteid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}