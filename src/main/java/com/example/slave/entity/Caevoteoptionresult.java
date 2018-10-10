package com.example.slave.entity;

import java.io.Serializable;

public class Caevoteoptionresult implements Serializable {
    private String optionresultid;

    private static final long serialVersionUID = 1L;

    public String getOptionresultid() {
        return optionresultid;
    }

    public void setOptionresultid(String optionresultid) {
        this.optionresultid = optionresultid == null ? null : optionresultid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", optionresultid=").append(optionresultid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}