package com.example.master.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Academicianmajorachievements extends BaseBean implements Serializable {
    private String majorachievementsid;

    private String selectedyear;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String academicianid;

    private String academicianuuid;

    private Integer majorachievementssn;

    private String achievementdesc;

    private String contributions;

    private String orgid;

    private String compid;

    private static final long serialVersionUID = 1L;

    public String getMajorachievementsid() {
        return majorachievementsid;
    }

    public void setMajorachievementsid(String majorachievementsid) {
        this.majorachievementsid = majorachievementsid == null ? null : majorachievementsid.trim();
    }

    public String getSelectedyear() {
        return selectedyear;
    }

    public void setSelectedyear(String selectedyear) {
        this.selectedyear = selectedyear == null ? null : selectedyear.trim();
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

    public String getAcademicianid() {
        return academicianid;
    }

    public void setAcademicianid(String academicianid) {
        this.academicianid = academicianid == null ? null : academicianid.trim();
    }

    public String getAcademicianuuid() {
        return academicianuuid;
    }

    public void setAcademicianuuid(String academicianuuid) {
        this.academicianuuid = academicianuuid == null ? null : academicianuuid.trim();
    }

    public Integer getMajorachievementssn() {
        return majorachievementssn;
    }

    public void setMajorachievementssn(Integer majorachievementssn) {
        this.majorachievementssn = majorachievementssn;
    }

    public String getAchievementdesc() {
        return achievementdesc;
    }

    public void setAchievementdesc(String achievementdesc) {
        this.achievementdesc = achievementdesc == null ? null : achievementdesc.trim();
    }

    public String getContributions() {
        return contributions;
    }

    public void setContributions(String contributions) {
        this.contributions = contributions == null ? null : contributions.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", majorachievementsid=").append(majorachievementsid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", academicianid=").append(academicianid);
        sb.append(", academicianuuid=").append(academicianuuid);
        sb.append(", majorachievementssn=").append(majorachievementssn);
        sb.append(", achievementdesc=").append(achievementdesc);
        sb.append(", contributions=").append(contributions);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}