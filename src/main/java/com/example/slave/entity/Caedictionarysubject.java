package com.example.slave.entity;

import java.io.Serializable;

public class Caedictionarysubject implements Serializable {
    private String subjectid;

    private String number;

    private Integer level;

    private String parentid;

    private String departmentid;

    private String name;

    private String iseffective;

    private String starttime;

    private String endtime;

    private static final long serialVersionUID = 1L;

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid == null ? null : subjectid.trim();
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

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", subjectid=").append(subjectid);
        sb.append(", number=").append(number);
        sb.append(", level=").append(level);
        sb.append(", parentid=").append(parentid);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", name=").append(name);
        sb.append(", iseffective=").append(iseffective);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}