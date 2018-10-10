package com.example.master.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Academician extends BaseBean implements Serializable {
    private String academicianid;

    private String academicianuuid;

    private String selectedyear;

    private Date createdt;

    private String createby;

    private Date updatedt;

    private String updateby;

    private String departmentnumber;

    private String departmentacrossnumber;

    private String isdead;

    private String deathdate;

    private String isrecall;

    private String academicianname;

    private String academicianlastnamespelling;

    private String academicianfirstnamespelling;

    private String certificatetype;

    private String certificatenumber;

    private String gender;

    private Integer ethnic;

    private Date birthday;

    private Integer age;

    private Integer origincountry;

    private Integer originprovince;

    private String origincity;

    private Integer origindistrict;

    private Integer birthcountry;

    private Integer birthprovince;

    private String birthcity;

    private Integer birthdistrict;

    private Integer technical;

    private Integer subject;

    private Integer subjectfirst;

    private Integer subjectsecond;

    private Integer subjectthird;

    private String professional;

    private Integer degreefirst;

    private Integer academicfirst;

    private Integer degreehighest;

    private Integer academichighest;

    private String ispostdoctoralexperience;

    private String engineeringacademyhistory;

    private String academysciencehistory;

    private String candidateid;

    private String importby;

    private Date importdt;

    private String orgid;

    private String compid;

    private String recommendname;

    private String recommendleader;

    private String isreview;

    private static final long serialVersionUID = 1L;

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

    public String getSelectedyear() {
        return selectedyear;
    }

    public void setSelectedyear(String selectedyear) {
        this.selectedyear = selectedyear == null ? null : selectedyear.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(Date updatedt) {
        this.updatedt = updatedt;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public String getDepartmentnumber() {
        return departmentnumber;
    }

    public void setDepartmentnumber(String departmentnumber) {
        this.departmentnumber = departmentnumber == null ? null : departmentnumber.trim();
    }

    public String getDepartmentacrossnumber() {
        return departmentacrossnumber;
    }

    public void setDepartmentacrossnumber(String departmentacrossnumber) {
        this.departmentacrossnumber = departmentacrossnumber == null ? null : departmentacrossnumber.trim();
    }

    public String getIsdead() {
        return isdead;
    }

    public void setIsdead(String isdead) {
        this.isdead = isdead == null ? null : isdead.trim();
    }

    public String getDeathdate() {
        return deathdate;
    }

    public void setDeathdate(String deathdate) {
        this.deathdate = deathdate == null ? null : deathdate.trim();
    }

    public String getIsrecall() {
        return isrecall;
    }

    public void setIsrecall(String isrecall) {
        this.isrecall = isrecall == null ? null : isrecall.trim();
    }

    public String getAcademicianname() {
        return academicianname;
    }

    public void setAcademicianname(String academicianname) {
        this.academicianname = academicianname == null ? null : academicianname.trim();
    }

    public String getAcademicianlastnamespelling() {
        return academicianlastnamespelling;
    }

    public void setAcademicianlastnamespelling(String academicianlastnamespelling) {
        this.academicianlastnamespelling = academicianlastnamespelling == null ? null : academicianlastnamespelling.trim();
    }

    public String getAcademicianfirstnamespelling() {
        return academicianfirstnamespelling;
    }

    public void setAcademicianfirstnamespelling(String academicianfirstnamespelling) {
        this.academicianfirstnamespelling = academicianfirstnamespelling == null ? null : academicianfirstnamespelling.trim();
    }

    public String getCertificatetype() {
        return certificatetype;
    }

    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype == null ? null : certificatetype.trim();
    }

    public String getCertificatenumber() {
        return certificatenumber;
    }

    public void setCertificatenumber(String certificatenumber) {
        this.certificatenumber = certificatenumber == null ? null : certificatenumber.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getEthnic() {
        return ethnic;
    }

    public void setEthnic(Integer ethnic) {
        this.ethnic = ethnic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getOrigincountry() {
        return origincountry;
    }

    public void setOrigincountry(Integer origincountry) {
        this.origincountry = origincountry;
    }

    public Integer getOriginprovince() {
        return originprovince;
    }

    public void setOriginprovince(Integer originprovince) {
        this.originprovince = originprovince;
    }

    public String getOrigincity() {
        return origincity;
    }

    public void setOrigincity(String origincity) {
        this.origincity = origincity == null ? null : origincity.trim();
    }

    public Integer getOrigindistrict() {
        return origindistrict;
    }

    public void setOrigindistrict(Integer origindistrict) {
        this.origindistrict = origindistrict;
    }

    public Integer getBirthcountry() {
        return birthcountry;
    }

    public void setBirthcountry(Integer birthcountry) {
        this.birthcountry = birthcountry;
    }

    public Integer getBirthprovince() {
        return birthprovince;
    }

    public void setBirthprovince(Integer birthprovince) {
        this.birthprovince = birthprovince;
    }

    public String getBirthcity() {
        return birthcity;
    }

    public void setBirthcity(String birthcity) {
        this.birthcity = birthcity == null ? null : birthcity.trim();
    }

    public Integer getBirthdistrict() {
        return birthdistrict;
    }

    public void setBirthdistrict(Integer birthdistrict) {
        this.birthdistrict = birthdistrict;
    }

    public Integer getTechnical() {
        return technical;
    }

    public void setTechnical(Integer technical) {
        this.technical = technical;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    public Integer getSubjectfirst() {
        return subjectfirst;
    }

    public void setSubjectfirst(Integer subjectfirst) {
        this.subjectfirst = subjectfirst;
    }

    public Integer getSubjectsecond() {
        return subjectsecond;
    }

    public void setSubjectsecond(Integer subjectsecond) {
        this.subjectsecond = subjectsecond;
    }

    public Integer getSubjectthird() {
        return subjectthird;
    }

    public void setSubjectthird(Integer subjectthird) {
        this.subjectthird = subjectthird;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public Integer getDegreefirst() {
        return degreefirst;
    }

    public void setDegreefirst(Integer degreefirst) {
        this.degreefirst = degreefirst;
    }

    public Integer getAcademicfirst() {
        return academicfirst;
    }

    public void setAcademicfirst(Integer academicfirst) {
        this.academicfirst = academicfirst;
    }

    public Integer getDegreehighest() {
        return degreehighest;
    }

    public void setDegreehighest(Integer degreehighest) {
        this.degreehighest = degreehighest;
    }

    public Integer getAcademichighest() {
        return academichighest;
    }

    public void setAcademichighest(Integer academichighest) {
        this.academichighest = academichighest;
    }

    public String getIspostdoctoralexperience() {
        return ispostdoctoralexperience;
    }

    public void setIspostdoctoralexperience(String ispostdoctoralexperience) {
        this.ispostdoctoralexperience = ispostdoctoralexperience == null ? null : ispostdoctoralexperience.trim();
    }

    public String getEngineeringacademyhistory() {
        return engineeringacademyhistory;
    }

    public void setEngineeringacademyhistory(String engineeringacademyhistory) {
        this.engineeringacademyhistory = engineeringacademyhistory == null ? null : engineeringacademyhistory.trim();
    }

    public String getAcademysciencehistory() {
        return academysciencehistory;
    }

    public void setAcademysciencehistory(String academysciencehistory) {
        this.academysciencehistory = academysciencehistory == null ? null : academysciencehistory.trim();
    }

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid == null ? null : candidateid.trim();
    }

    public String getImportby() {
        return importby;
    }

    public void setImportby(String importby) {
        this.importby = importby == null ? null : importby.trim();
    }

    public Date getImportdt() {
        return importdt;
    }

    public void setImportdt(Date importdt) {
        this.importdt = importdt;
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

    public String getRecommendname() {
        return recommendname;
    }

    public void setRecommendname(String recommendname) {
        this.recommendname = recommendname == null ? null : recommendname.trim();
    }

    public String getRecommendleader() {
        return recommendleader;
    }

    public void setRecommendleader(String recommendleader) {
        this.recommendleader = recommendleader == null ? null : recommendleader.trim();
    }

    public String getIsreview() {
        return isreview;
    }

    public void setIsreview(String isreview) {
        this.isreview = isreview == null ? null : isreview.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", academicianid=").append(academicianid);
        sb.append(", academicianuuid=").append(academicianuuid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", createdt=").append(createdt);
        sb.append(", createby=").append(createby);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", updateby=").append(updateby);
        sb.append(", departmentnumber=").append(departmentnumber);
        sb.append(", departmentacrossnumber=").append(departmentacrossnumber);
        sb.append(", isdead=").append(isdead);
        sb.append(", deathdate=").append(deathdate);
        sb.append(", isrecall=").append(isrecall);
        sb.append(", academicianname=").append(academicianname);
        sb.append(", academicianlastnamespelling=").append(academicianlastnamespelling);
        sb.append(", academicianfirstnamespelling=").append(academicianfirstnamespelling);
        sb.append(", certificatetype=").append(certificatetype);
        sb.append(", certificatenumber=").append(certificatenumber);
        sb.append(", gender=").append(gender);
        sb.append(", ethnic=").append(ethnic);
        sb.append(", birthday=").append(birthday);
        sb.append(", age=").append(age);
        sb.append(", origincountry=").append(origincountry);
        sb.append(", originprovince=").append(originprovince);
        sb.append(", origincity=").append(origincity);
        sb.append(", origindistrict=").append(origindistrict);
        sb.append(", birthcountry=").append(birthcountry);
        sb.append(", birthprovince=").append(birthprovince);
        sb.append(", birthcity=").append(birthcity);
        sb.append(", birthdistrict=").append(birthdistrict);
        sb.append(", technical=").append(technical);
        sb.append(", subject=").append(subject);
        sb.append(", subjectfirst=").append(subjectfirst);
        sb.append(", subjectsecond=").append(subjectsecond);
        sb.append(", subjectthird=").append(subjectthird);
        sb.append(", professional=").append(professional);
        sb.append(", degreefirst=").append(degreefirst);
        sb.append(", academicfirst=").append(academicfirst);
        sb.append(", degreehighest=").append(degreehighest);
        sb.append(", academichighest=").append(academichighest);
        sb.append(", ispostdoctoralexperience=").append(ispostdoctoralexperience);
        sb.append(", engineeringacademyhistory=").append(engineeringacademyhistory);
        sb.append(", academysciencehistory=").append(academysciencehistory);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", importby=").append(importby);
        sb.append(", importdt=").append(importdt);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", recommendname=").append(recommendname);
        sb.append(", recommendleader=").append(recommendleader);
        sb.append(", isreview=").append(isreview);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}