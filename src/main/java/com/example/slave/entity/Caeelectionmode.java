package com.example.slave.entity;

import java.io.Serializable;

public class Caeelectionmode implements Serializable {
    private String elecmodeid;

    private static final long serialVersionUID = 1L;

    public String getElecmodeid() {
        return elecmodeid;
    }

    public void setElecmodeid(String elecmodeid) {
        this.elecmodeid = elecmodeid == null ? null : elecmodeid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elecmodeid=").append(elecmodeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}