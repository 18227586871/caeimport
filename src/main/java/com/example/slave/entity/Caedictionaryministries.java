package com.example.slave.entity;

import java.io.Serializable;

public class Caedictionaryministries implements Serializable {
    private String ministriesid;

    private Integer ministriesnumber;

    private String name;

    private String iseffective;

    private String starttime;

    private String endtime;

    private String unitdepartmentid;

    private String nominationid;

    private static final long serialVersionUID = 1L;

    public String getMinistriesid() {
        return ministriesid;
    }

    public void setMinistriesid(String ministriesid) {
        this.ministriesid = ministriesid == null ? null : ministriesid.trim();
    }

    public Integer getMinistriesnumber() {
        return ministriesnumber;
    }

    public void setMinistriesnumber(Integer ministriesnumber) {
        this.ministriesnumber = ministriesnumber;
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

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getUnitdepartmentid() {
        return unitdepartmentid;
    }

    public void setUnitdepartmentid(String unitdepartmentid) {
        this.unitdepartmentid = unitdepartmentid == null ? null : unitdepartmentid.trim();
    }

    public String getNominationid() {
        return nominationid;
    }

    public void setNominationid(String nominationid) {
        this.nominationid = nominationid == null ? null : nominationid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ministriesid=").append(ministriesid);
        sb.append(", ministriesnumber=").append(ministriesnumber);
        sb.append(", name=").append(name);
        sb.append(", iseffective=").append(iseffective);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", unitdepartmentid=").append(unitdepartmentid);
        sb.append(", nominationid=").append(nominationid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}