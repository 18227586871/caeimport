package com.example.slave.entity;

import java.io.Serializable;

public class Caedictionaryacademic implements Serializable {
    private String academicid;

    private String number;

    private String name;

    private String iseffective;

    private static final long serialVersionUID = 1L;

    public String getAcademicid() {
        return academicid;
    }

    public void setAcademicid(String academicid) {
        this.academicid = academicid == null ? null : academicid.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIseffective() {
        return iseffective;
    }

    public void setIseffective(String iseffective) {
        this.iseffective = iseffective == null ? null : iseffective.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", academicid=").append(academicid);
        sb.append(", number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", iseffective=").append(iseffective);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}