package com.example.slave.entity;

import java.io.Serializable;

public class Caecandidatecheckresult implements Serializable {
    private String candidatecheckresultid;

    private String recepitnumber;

    private String name;

    private String errorreason;

    private static final long serialVersionUID = 1L;

    public String getCandidatecheckresultid() {
        return candidatecheckresultid;
    }

    public void setCandidatecheckresultid(String candidatecheckresultid) {
        this.candidatecheckresultid = candidatecheckresultid == null ? null : candidatecheckresultid.trim();
    }

    public String getRecepitnumber() {
        return recepitnumber;
    }

    public void setRecepitnumber(String recepitnumber) {
        this.recepitnumber = recepitnumber == null ? null : recepitnumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getErrorreason() {
        return errorreason;
    }

    public void setErrorreason(String errorreason) {
        this.errorreason = errorreason == null ? null : errorreason.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", candidatecheckresultid=").append(candidatecheckresultid);
        sb.append(", recepitnumber=").append(recepitnumber);
        sb.append(", name=").append(name);
        sb.append(", errorreason=").append(errorreason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}