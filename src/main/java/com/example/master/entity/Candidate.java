package com.example.master.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Candidate extends BaseBean implements Serializable {
    private Integer candidateid;

    private String candidateuuid;

    private String selectedyear;

    private String createby;

    private Date createdt;

    private String updateby;

    private Date updatedt;

    private String isdelete;

    private String receiptnumber;

    private String receiptdate;

    private String name;

    private String lastnamespelling;

    private String firstnamespelling;

    private String certificatetype;

    private String certificatenumber;

    private String gender;

    private Integer ethnic;

    private Date birthday;

    private Integer age;

    private String origincountry;

    private String originprovince;

    private String origincity;

    private String origindistrict;

    private String birthcountry;

    private String birthprovince;

    private String birthcity;

    private String birthdistrict;

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

    private String proposednomination;

    private String nomination;

    private String nomineename;

    private String nominateleader;

    private String nominateinfocheckleader;

    private String selectdepartment;

    private Integer selectcommitteenumber;

    private String selectcommitteeuuid;

    private Integer votenumber;

    private String isaccept;

    private String importby;

    private Date importdt;

    private String isreview;

    private String invalidreviewreason;

    private String reviewby;

    private Date reviewdt;

    private String ismajornomination;

    private String departmentid;

    private String groupid;

    private String groupnumber;

    private String nominationnumber;

    private String divisionselected;

    private String iselected;

    private String nominationacademicianlist;

    private String unacceptreason;

    private String technicalmore;

    private String academichighestmore;

    private String degreehighestmore;

    private String recommendeddepartmentname;

    private String recommendeddepartmentleader;

    private String academicfirstmore;

    private String degreefirstmore;

    private String informationbarcode;

    private String orgid;

    private String compid;

    private String filepath;

    private String academicethicsstatement;

    private String agencycadrestatement;

    private String militarycadrestatement;

    private static final long serialVersionUID = 1L;

    public Integer getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(Integer candidateid) {
        this.candidateid = candidateid;
    }

    public String getCandidateuuid() {
        return candidateuuid;
    }

    public void setCandidateuuid(String candidateuuid) {
        this.candidateuuid = candidateuuid == null ? null : candidateuuid.trim();
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

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Date getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(Date updatedt) {
        this.updatedt = updatedt;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }

    public String getReceiptnumber() {
        return receiptnumber;
    }

    public void setReceiptnumber(String receiptnumber) {
        this.receiptnumber = receiptnumber == null ? null : receiptnumber.trim();
    }

    public String getReceiptdate() {
        return receiptdate;
    }

    public void setReceiptdate(String receiptdate) {
        this.receiptdate = receiptdate == null ? null : receiptdate.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLastnamespelling() {
        return lastnamespelling;
    }

    public void setLastnamespelling(String lastnamespelling) {
        this.lastnamespelling = lastnamespelling == null ? null : lastnamespelling.trim();
    }

    public String getFirstnamespelling() {
        return firstnamespelling;
    }

    public void setFirstnamespelling(String firstnamespelling) {
        this.firstnamespelling = firstnamespelling == null ? null : firstnamespelling.trim();
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

    public String getOrigincountry() {
        return origincountry;
    }

    public void setOrigincountry(String origincountry) {
        this.origincountry = origincountry == null ? null : origincountry.trim();
    }

    public String getOriginprovince() {
        return originprovince;
    }

    public void setOriginprovince(String originprovince) {
        this.originprovince = originprovince == null ? null : originprovince.trim();
    }

    public String getOrigincity() {
        return origincity;
    }

    public void setOrigincity(String origincity) {
        this.origincity = origincity == null ? null : origincity.trim();
    }

    public String getOrigindistrict() {
        return origindistrict;
    }

    public void setOrigindistrict(String origindistrict) {
        this.origindistrict = origindistrict == null ? null : origindistrict.trim();
    }

    public String getBirthcountry() {
        return birthcountry;
    }

    public void setBirthcountry(String birthcountry) {
        this.birthcountry = birthcountry == null ? null : birthcountry.trim();
    }

    public String getBirthprovince() {
        return birthprovince;
    }

    public void setBirthprovince(String birthprovince) {
        this.birthprovince = birthprovince == null ? null : birthprovince.trim();
    }

    public String getBirthcity() {
        return birthcity;
    }

    public void setBirthcity(String birthcity) {
        this.birthcity = birthcity == null ? null : birthcity.trim();
    }

    public String getBirthdistrict() {
        return birthdistrict;
    }

    public void setBirthdistrict(String birthdistrict) {
        this.birthdistrict = birthdistrict == null ? null : birthdistrict.trim();
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

    public String getProposednomination() {
        return proposednomination;
    }

    public void setProposednomination(String proposednomination) {
        this.proposednomination = proposednomination == null ? null : proposednomination.trim();
    }

    public String getNomination() {
        return nomination;
    }

    public void setNomination(String nomination) {
        this.nomination = nomination == null ? null : nomination.trim();
    }

    public String getNomineename() {
        return nomineename;
    }

    public void setNomineename(String nomineename) {
        this.nomineename = nomineename == null ? null : nomineename.trim();
    }

    public String getNominateleader() {
        return nominateleader;
    }

    public void setNominateleader(String nominateleader) {
        this.nominateleader = nominateleader == null ? null : nominateleader.trim();
    }

    public String getNominateinfocheckleader() {
        return nominateinfocheckleader;
    }

    public void setNominateinfocheckleader(String nominateinfocheckleader) {
        this.nominateinfocheckleader = nominateinfocheckleader == null ? null : nominateinfocheckleader.trim();
    }

    public String getSelectdepartment() {
        return selectdepartment;
    }

    public void setSelectdepartment(String selectdepartment) {
        this.selectdepartment = selectdepartment == null ? null : selectdepartment.trim();
    }

    public Integer getSelectcommitteenumber() {
        return selectcommitteenumber;
    }

    public void setSelectcommitteenumber(Integer selectcommitteenumber) {
        this.selectcommitteenumber = selectcommitteenumber;
    }

    public String getSelectcommitteeuuid() {
        return selectcommitteeuuid;
    }

    public void setSelectcommitteeuuid(String selectcommitteeuuid) {
        this.selectcommitteeuuid = selectcommitteeuuid == null ? null : selectcommitteeuuid.trim();
    }

    public Integer getVotenumber() {
        return votenumber;
    }

    public void setVotenumber(Integer votenumber) {
        this.votenumber = votenumber;
    }

    public String getIsaccept() {
        return isaccept;
    }

    public void setIsaccept(String isaccept) {
        this.isaccept = isaccept == null ? null : isaccept.trim();
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

    public String getIsreview() {
        return isreview;
    }

    public void setIsreview(String isreview) {
        this.isreview = isreview == null ? null : isreview.trim();
    }

    public String getInvalidreviewreason() {
        return invalidreviewreason;
    }

    public void setInvalidreviewreason(String invalidreviewreason) {
        this.invalidreviewreason = invalidreviewreason == null ? null : invalidreviewreason.trim();
    }

    public String getReviewby() {
        return reviewby;
    }

    public void setReviewby(String reviewby) {
        this.reviewby = reviewby == null ? null : reviewby.trim();
    }

    public Date getReviewdt() {
        return reviewdt;
    }

    public void setReviewdt(Date reviewdt) {
        this.reviewdt = reviewdt;
    }

    public String getIsmajornomination() {
        return ismajornomination;
    }

    public void setIsmajornomination(String ismajornomination) {
        this.ismajornomination = ismajornomination == null ? null : ismajornomination.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(String groupnumber) {
        this.groupnumber = groupnumber == null ? null : groupnumber.trim();
    }

    public String getNominationnumber() {
        return nominationnumber;
    }

    public void setNominationnumber(String nominationnumber) {
        this.nominationnumber = nominationnumber == null ? null : nominationnumber.trim();
    }

    public String getDivisionselected() {
        return divisionselected;
    }

    public void setDivisionselected(String divisionselected) {
        this.divisionselected = divisionselected == null ? null : divisionselected.trim();
    }

    public String getIselected() {
        return iselected;
    }

    public void setIselected(String iselected) {
        this.iselected = iselected == null ? null : iselected.trim();
    }

    public String getNominationacademicianlist() {
        return nominationacademicianlist;
    }

    public void setNominationacademicianlist(String nominationacademicianlist) {
        this.nominationacademicianlist = nominationacademicianlist == null ? null : nominationacademicianlist.trim();
    }

    public String getUnacceptreason() {
        return unacceptreason;
    }

    public void setUnacceptreason(String unacceptreason) {
        this.unacceptreason = unacceptreason == null ? null : unacceptreason.trim();
    }

    public String getTechnicalmore() {
        return technicalmore;
    }

    public void setTechnicalmore(String technicalmore) {
        this.technicalmore = technicalmore == null ? null : technicalmore.trim();
    }

    public String getAcademichighestmore() {
        return academichighestmore;
    }

    public void setAcademichighestmore(String academichighestmore) {
        this.academichighestmore = academichighestmore == null ? null : academichighestmore.trim();
    }

    public String getDegreehighestmore() {
        return degreehighestmore;
    }

    public void setDegreehighestmore(String degreehighestmore) {
        this.degreehighestmore = degreehighestmore == null ? null : degreehighestmore.trim();
    }

    public String getRecommendeddepartmentname() {
        return recommendeddepartmentname;
    }

    public void setRecommendeddepartmentname(String recommendeddepartmentname) {
        this.recommendeddepartmentname = recommendeddepartmentname == null ? null : recommendeddepartmentname.trim();
    }

    public String getRecommendeddepartmentleader() {
        return recommendeddepartmentleader;
    }

    public void setRecommendeddepartmentleader(String recommendeddepartmentleader) {
        this.recommendeddepartmentleader = recommendeddepartmentleader == null ? null : recommendeddepartmentleader.trim();
    }

    public String getAcademicfirstmore() {
        return academicfirstmore;
    }

    public void setAcademicfirstmore(String academicfirstmore) {
        this.academicfirstmore = academicfirstmore == null ? null : academicfirstmore.trim();
    }

    public String getDegreefirstmore() {
        return degreefirstmore;
    }

    public void setDegreefirstmore(String degreefirstmore) {
        this.degreefirstmore = degreefirstmore == null ? null : degreefirstmore.trim();
    }

    public String getInformationbarcode() {
        return informationbarcode;
    }

    public void setInformationbarcode(String informationbarcode) {
        this.informationbarcode = informationbarcode == null ? null : informationbarcode.trim();
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

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getAcademicethicsstatement() {
        return academicethicsstatement;
    }

    public void setAcademicethicsstatement(String academicethicsstatement) {
        this.academicethicsstatement = academicethicsstatement == null ? null : academicethicsstatement.trim();
    }

    public String getAgencycadrestatement() {
        return agencycadrestatement;
    }

    public void setAgencycadrestatement(String agencycadrestatement) {
        this.agencycadrestatement = agencycadrestatement == null ? null : agencycadrestatement.trim();
    }

    public String getMilitarycadrestatement() {
        return militarycadrestatement;
    }

    public void setMilitarycadrestatement(String militarycadrestatement) {
        this.militarycadrestatement = militarycadrestatement == null ? null : militarycadrestatement.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", candidateid=").append(candidateid);
        sb.append(", candidateuuid=").append(candidateuuid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", createby=").append(createby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updateby=").append(updateby);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", receiptnumber=").append(receiptnumber);
        sb.append(", receiptdate=").append(receiptdate);
        sb.append(", name=").append(name);
        sb.append(", lastnamespelling=").append(lastnamespelling);
        sb.append(", firstnamespelling=").append(firstnamespelling);
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
        sb.append(", proposednomination=").append(proposednomination);
        sb.append(", nomination=").append(nomination);
        sb.append(", nomineename=").append(nomineename);
        sb.append(", nominateleader=").append(nominateleader);
        sb.append(", nominateinfocheckleader=").append(nominateinfocheckleader);
        sb.append(", selectdepartment=").append(selectdepartment);
        sb.append(", selectcommitteenumber=").append(selectcommitteenumber);
        sb.append(", selectcommitteeuuid=").append(selectcommitteeuuid);
        sb.append(", votenumber=").append(votenumber);
        sb.append(", isaccept=").append(isaccept);
        sb.append(", importby=").append(importby);
        sb.append(", importdt=").append(importdt);
        sb.append(", isreview=").append(isreview);
        sb.append(", invalidreviewreason=").append(invalidreviewreason);
        sb.append(", reviewby=").append(reviewby);
        sb.append(", reviewdt=").append(reviewdt);
        sb.append(", ismajornomination=").append(ismajornomination);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", groupid=").append(groupid);
        sb.append(", groupnumber=").append(groupnumber);
        sb.append(", nominationnumber=").append(nominationnumber);
        sb.append(", divisionselected=").append(divisionselected);
        sb.append(", iselected=").append(iselected);
        sb.append(", nominationacademicianlist=").append(nominationacademicianlist);
        sb.append(", unacceptreason=").append(unacceptreason);
        sb.append(", technicalmore=").append(technicalmore);
        sb.append(", academichighestmore=").append(academichighestmore);
        sb.append(", degreehighestmore=").append(degreehighestmore);
        sb.append(", recommendeddepartmentname=").append(recommendeddepartmentname);
        sb.append(", recommendeddepartmentleader=").append(recommendeddepartmentleader);
        sb.append(", academicfirstmore=").append(academicfirstmore);
        sb.append(", degreefirstmore=").append(degreefirstmore);
        sb.append(", informationbarcode=").append(informationbarcode);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", filepath=").append(filepath);
        sb.append(", academicethicsstatement=").append(academicethicsstatement);
        sb.append(", agencycadrestatement=").append(agencycadrestatement);
        sb.append(", militarycadrestatement=").append(militarycadrestatement);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}