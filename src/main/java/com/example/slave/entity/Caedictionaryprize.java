package com.example.slave.entity;

import java.io.Serializable;

public class Caedictionaryprize implements Serializable {
    private String prizeid;

    private String number;

    private String name;

    private static final long serialVersionUID = 1L;

    public String getPrizeid() {
        return prizeid;
    }

    public void setPrizeid(String prizeid) {
        this.prizeid = prizeid == null ? null : prizeid.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prizeid=").append(prizeid);
        sb.append(", number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}