package com.example.master.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Candidatecontactinfo extends BaseBean implements Serializable {
    private String contactinfoid;

    private String selectedyear;

    private String createby;

    private Date createdt;

    private String updateby;

    private Date updatedt;

    private String candidateid;

    private String candidateuuid;

    private String contactinfocategory;

    private String mobilephone;

    private String fixedtelephone;

    private String fax;

    private String email;

    private String mailingaddress;

    private String postalcode;

    private String spousename;

    private String familyaddress;

    private String familyzipcode;

    private String contactname;

    private String contactinformation;

    private String orgid;

    private String compid;

    private static final long serialVersionUID = 1L;

    public String getContactinfoid() {
        return contactinfoid;
    }

    public void setContactinfoid(String contactinfoid) {
        this.contactinfoid = contactinfoid == null ? null : contactinfoid.trim();
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

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid == null ? null : candidateid.trim();
    }

    public String getCandidateuuid() {
        return candidateuuid;
    }

    public void setCandidateuuid(String candidateuuid) {
        this.candidateuuid = candidateuuid == null ? null : candidateuuid.trim();
    }

    public String getContactinfocategory() {
        return contactinfocategory;
    }

    public void setContactinfocategory(String contactinfocategory) {
        this.contactinfocategory = contactinfocategory == null ? null : contactinfocategory.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getFixedtelephone() {
        return fixedtelephone;
    }

    public void setFixedtelephone(String fixedtelephone) {
        this.fixedtelephone = fixedtelephone == null ? null : fixedtelephone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMailingaddress() {
        return mailingaddress;
    }

    public void setMailingaddress(String mailingaddress) {
        this.mailingaddress = mailingaddress == null ? null : mailingaddress.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getSpousename() {
        return spousename;
    }

    public void setSpousename(String spousename) {
        this.spousename = spousename == null ? null : spousename.trim();
    }

    public String getFamilyaddress() {
        return familyaddress;
    }

    public void setFamilyaddress(String familyaddress) {
        this.familyaddress = familyaddress == null ? null : familyaddress.trim();
    }

    public String getFamilyzipcode() {
        return familyzipcode;
    }

    public void setFamilyzipcode(String familyzipcode) {
        this.familyzipcode = familyzipcode == null ? null : familyzipcode.trim();
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname == null ? null : contactname.trim();
    }

    public String getContactinformation() {
        return contactinformation;
    }

    public void setContactinformation(String contactinformation) {
        this.contactinformation = contactinformation == null ? null : contactinformation.trim();
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
        sb.append(", contactinfoid=").append(contactinfoid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", createby=").append(createby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updateby=").append(updateby);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", candidateid=").append(candidateid);
        sb.append(", candidateuuid=").append(candidateuuid);
        sb.append(", contactinfocategory=").append(contactinfocategory);
        sb.append(", mobilephone=").append(mobilephone);
        sb.append(", fixedtelephone=").append(fixedtelephone);
        sb.append(", fax=").append(fax);
        sb.append(", email=").append(email);
        sb.append(", mailingaddress=").append(mailingaddress);
        sb.append(", postalcode=").append(postalcode);
        sb.append(", spousename=").append(spousename);
        sb.append(", familyaddress=").append(familyaddress);
        sb.append(", familyzipcode=").append(familyzipcode);
        sb.append(", contactname=").append(contactname);
        sb.append(", contactinformation=").append(contactinformation);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}