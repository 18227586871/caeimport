package com.example.slave.entity;

import java.io.Serializable;
import java.util.Date;

public class Caedepartmentelectionrules implements Serializable {
    private String departmentelectionrulesid;

    private Integer nominatedneedacademicians;

    private Integer nominatedneedfacultyacademicians;

    private Integer maxacademiciansnominated;

    private Integer overagenominatedneedacademicians;

    private Integer overagenominatedneedfacultyacademicians;

    private String selectyear;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private String departmentid;

    private static final long serialVersionUID = 1L;

    public String getDepartmentelectionrulesid() {
        return departmentelectionrulesid;
    }

    public void setDepartmentelectionrulesid(String departmentelectionrulesid) {
        this.departmentelectionrulesid = departmentelectionrulesid == null ? null : departmentelectionrulesid.trim();
    }

    public Integer getNominatedneedacademicians() {
        return nominatedneedacademicians;
    }

    public void setNominatedneedacademicians(Integer nominatedneedacademicians) {
        this.nominatedneedacademicians = nominatedneedacademicians;
    }

    public Integer getNominatedneedfacultyacademicians() {
        return nominatedneedfacultyacademicians;
    }

    public void setNominatedneedfacultyacademicians(Integer nominatedneedfacultyacademicians) {
        this.nominatedneedfacultyacademicians = nominatedneedfacultyacademicians;
    }

    public Integer getMaxacademiciansnominated() {
        return maxacademiciansnominated;
    }

    public void setMaxacademiciansnominated(Integer maxacademiciansnominated) {
        this.maxacademiciansnominated = maxacademiciansnominated;
    }

    public Integer getOveragenominatedneedacademicians() {
        return overagenominatedneedacademicians;
    }

    public void setOveragenominatedneedacademicians(Integer overagenominatedneedacademicians) {
        this.overagenominatedneedacademicians = overagenominatedneedacademicians;
    }

    public Integer getOveragenominatedneedfacultyacademicians() {
        return overagenominatedneedfacultyacademicians;
    }

    public void setOveragenominatedneedfacultyacademicians(Integer overagenominatedneedfacultyacademicians) {
        this.overagenominatedneedfacultyacademicians = overagenominatedneedfacultyacademicians;
    }

    public String getSelectyear() {
        return selectyear;
    }

    public void setSelectyear(String selectyear) {
        this.selectyear = selectyear == null ? null : selectyear.trim();
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public Date getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(Date updatedt) {
        this.updatedt = updatedt;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid == null ? null : compid.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", departmentelectionrulesid=").append(departmentelectionrulesid);
        sb.append(", nominatedneedacademicians=").append(nominatedneedacademicians);
        sb.append(", nominatedneedfacultyacademicians=").append(nominatedneedfacultyacademicians);
        sb.append(", maxacademiciansnominated=").append(maxacademiciansnominated);
        sb.append(", overagenominatedneedacademicians=").append(overagenominatedneedacademicians);
        sb.append(", overagenominatedneedfacultyacademicians=").append(overagenominatedneedfacultyacademicians);
        sb.append(", selectyear=").append(selectyear);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}