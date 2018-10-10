package com.example.slave.entity;

import java.io.Serializable;
import java.util.Date;

public class Caeadditiondepartment implements Serializable {
    private String additiondepartmentid;

    private Integer seventypeopleneednum;

    private Integer seventydepartmentneednum;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String orgid;

    private String compid;

    private String selectedyear;

    private String departmentid;

    private Integer needpeoplenum;

    private Integer needdepartmentnum;

    private Integer needmostpeopelnum;

    private static final long serialVersionUID = 1L;

    public String getAdditiondepartmentid() {
        return additiondepartmentid;
    }

    public void setAdditiondepartmentid(String additiondepartmentid) {
        this.additiondepartmentid = additiondepartmentid == null ? null : additiondepartmentid.trim();
    }

    public Integer getSeventypeopleneednum() {
        return seventypeopleneednum;
    }

    public void setSeventypeopleneednum(Integer seventypeopleneednum) {
        this.seventypeopleneednum = seventypeopleneednum;
    }

    public Integer getSeventydepartmentneednum() {
        return seventydepartmentneednum;
    }

    public void setSeventydepartmentneednum(Integer seventydepartmentneednum) {
        this.seventydepartmentneednum = seventydepartmentneednum;
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

    public String getSelectedyear() {
        return selectedyear;
    }

    public void setSelectedyear(String selectedyear) {
        this.selectedyear = selectedyear == null ? null : selectedyear.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public Integer getNeedpeoplenum() {
        return needpeoplenum;
    }

    public void setNeedpeoplenum(Integer needpeoplenum) {
        this.needpeoplenum = needpeoplenum;
    }

    public Integer getNeeddepartmentnum() {
        return needdepartmentnum;
    }

    public void setNeeddepartmentnum(Integer needdepartmentnum) {
        this.needdepartmentnum = needdepartmentnum;
    }

    public Integer getNeedmostpeopelnum() {
        return needmostpeopelnum;
    }

    public void setNeedmostpeopelnum(Integer needmostpeopelnum) {
        this.needmostpeopelnum = needmostpeopelnum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", additiondepartmentid=").append(additiondepartmentid);
        sb.append(", seventypeopleneednum=").append(seventypeopleneednum);
        sb.append(", seventydepartmentneednum=").append(seventydepartmentneednum);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", needpeoplenum=").append(needpeoplenum);
        sb.append(", needdepartmentnum=").append(needdepartmentnum);
        sb.append(", needmostpeopelnum=").append(needmostpeopelnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}