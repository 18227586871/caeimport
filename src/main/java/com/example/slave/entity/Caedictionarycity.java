package com.example.slave.entity;

import java.io.Serializable;

public class Caedictionarycity implements Serializable {
    private String cityid;

    private String number;

    private Integer level;

    private Integer territories;

    private String name;

    private static final long serialVersionUID = 1L;

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getTerritories() {
        return territories;
    }

    public void setTerritories(Integer territories) {
        this.territories = territories;
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
        sb.append(", cityid=").append(cityid);
        sb.append(", number=").append(number);
        sb.append(", level=").append(level);
        sb.append(", territories=").append(territories);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}