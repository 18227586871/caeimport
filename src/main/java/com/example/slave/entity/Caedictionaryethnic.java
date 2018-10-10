package com.example.slave.entity;

import java.io.Serializable;

public class Caedictionaryethnic implements Serializable {
    private String ethnicid;

    private String number;

    private String name;

    private Integer type;

    private static final long serialVersionUID = 1L;

    public String getEthnicid() {
        return ethnicid;
    }

    public void setEthnicid(String ethnicid) {
        this.ethnicid = ethnicid == null ? null : ethnicid.trim();
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ethnicid=").append(ethnicid);
        sb.append(", number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}