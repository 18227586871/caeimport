package com.example.master.entity;

import com.example.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;

public class Academicianemployer extends BaseBean implements Serializable {
    private String employerid;

    private String selectedyear;

    private String createby;

    private String updateby;

    private Date createdt;

    private Date updatedt;

    private String academicianid;

    private String academicianuuid;

    private Integer employersn;

    private String fullname;

    private String abbreviation;

    private String technicalposition;

    private String administrativeduties;

    private String mailingaddress;

    private String zipcode;

    private String phone;

    private String fax;

    private String country;

    private String province;

    private String city;

    private String district;

    private Integer natureunit;

    private Integer industrialnature;

    private Integer departmentcategory;

    private Integer department;

    private String orgid;

    private String compid;

    private static final long serialVersionUID = 1L;

    public String getEmployerid() {
        return employerid;
    }

    public void setEmployerid(String employerid) {
        this.employerid = employerid == null ? null : employerid.trim();
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

    public Integer getEmployersn() {
        return employersn;
    }

    public void setEmployersn(Integer employersn) {
        this.employersn = employersn;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }

    public String getTechnicalposition() {
        return technicalposition;
    }

    public void setTechnicalposition(String technicalposition) {
        this.technicalposition = technicalposition == null ? null : technicalposition.trim();
    }

    public String getAdministrativeduties() {
        return administrativeduties;
    }

    public void setAdministrativeduties(String administrativeduties) {
        this.administrativeduties = administrativeduties == null ? null : administrativeduties.trim();
    }

    public String getMailingaddress() {
        return mailingaddress;
    }

    public void setMailingaddress(String mailingaddress) {
        this.mailingaddress = mailingaddress == null ? null : mailingaddress.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Integer getNatureunit() {
        return natureunit;
    }

    public void setNatureunit(Integer natureunit) {
        this.natureunit = natureunit;
    }

    public Integer getIndustrialnature() {
        return industrialnature;
    }

    public void setIndustrialnature(Integer industrialnature) {
        this.industrialnature = industrialnature;
    }

    public Integer getDepartmentcategory() {
        return departmentcategory;
    }

    public void setDepartmentcategory(Integer departmentcategory) {
        this.departmentcategory = departmentcategory;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
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
        sb.append(", employerid=").append(employerid);
        sb.append(", selectedyear=").append(selectedyear);
        sb.append(", createby=").append(createby);
        sb.append(", updateby=").append(updateby);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append(", academicianid=").append(academicianid);
        sb.append(", academicianuuid=").append(academicianuuid);
        sb.append(", employersn=").append(employersn);
        sb.append(", fullname=").append(fullname);
        sb.append(", abbreviation=").append(abbreviation);
        sb.append(", technicalposition=").append(technicalposition);
        sb.append(", administrativeduties=").append(administrativeduties);
        sb.append(", mailingaddress=").append(mailingaddress);
        sb.append(", zipcode=").append(zipcode);
        sb.append(", phone=").append(phone);
        sb.append(", fax=").append(fax);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", natureunit=").append(natureunit);
        sb.append(", industrialnature=").append(industrialnature);
        sb.append(", departmentcategory=").append(departmentcategory);
        sb.append(", department=").append(department);
        sb.append(", orgid=").append(orgid);
        sb.append(", compid=").append(compid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}