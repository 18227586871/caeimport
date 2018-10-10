package com.example.slave.entity;

import java.io.Serializable;

public class Caedictionaryposition implements Serializable {
    private String positionid;

    private String number;

    private String name;

    private String isadvanced;

    private static final long serialVersionUID = 1L;

    public String getPositionid() {
        return positionid;
    }

    public void setPositionid(String positionid) {
        this.positionid = positionid == null ? null : positionid.trim();
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

    public String getIsadvanced() {
        return isadvanced;
    }

    public void setIsadvanced(String isadvanced) {
        this.isadvanced = isadvanced == null ? null : isadvanced.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", positionid=").append(positionid);
        sb.append(", number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", isadvanced=").append(isadvanced);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}