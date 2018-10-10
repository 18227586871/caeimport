package com.example.slave.entity;

import java.io.Serializable;

public class Caedictionaryethnictype implements Serializable {
    private String ethnictypeid;

    private String name;

    private static final long serialVersionUID = 1L;

    public String getEthnictypeid() {
        return ethnictypeid;
    }

    public void setEthnictypeid(String ethnictypeid) {
        this.ethnictypeid = ethnictypeid == null ? null : ethnictypeid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ethnictypeid=").append(ethnictypeid);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}