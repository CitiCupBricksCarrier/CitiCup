package com.citicup.model;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uid
     *
     * @mbggenerated
     */
    private String uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phoneNum
     *
     * @mbggenerated
     */
    private String phonenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.isBinded
     *
     * @mbggenerated
     */
    private Byte isbinded;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.citiNum
     *
     * @mbggenerated
     */
    private String citinum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbggenerated
     */
    private String birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.idNum
     *
     * @mbggenerated
     */
    private String idnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.occupation
     *
     * @mbggenerated
     */
    private String occupation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.organization
     *
     * @mbggenerated
     */
    private String organization;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.contactNum
     *
     * @mbggenerated
     */
    private String contactnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.summary
     *
     * @mbggenerated
     */
    private String summary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.credit
     *
     * @mbggenerated
     */
    private Integer credit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uid
     *
     * @return the value of user.uid
     *
     * @mbggenerated
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uid
     *
     * @param uid the value for user.uid
     *
     * @mbggenerated
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phoneNum
     *
     * @return the value of user.phoneNum
     *
     * @mbggenerated
     */
    public String getPhonenum() {
        return phonenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phoneNum
     *
     * @param phonenum the value for user.phoneNum
     *
     * @mbggenerated
     */
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.isBinded
     *
     * @return the value of user.isBinded
     *
     * @mbggenerated
     */
    public Byte getIsbinded() {
        return isbinded;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.isBinded
     *
     * @param isbinded the value for user.isBinded
     *
     * @mbggenerated
     */
    public void setIsbinded(Byte isbinded) {
        this.isbinded = isbinded;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.citiNum
     *
     * @return the value of user.citiNum
     *
     * @mbggenerated
     */
    public String getCitinum() {
        return citinum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.citiNum
     *
     * @param citinum the value for user.citiNum
     *
     * @mbggenerated
     */
    public void setCitinum(String citinum) {
        this.citinum = citinum == null ? null : citinum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbggenerated
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbggenerated
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.idNum
     *
     * @return the value of user.idNum
     *
     * @mbggenerated
     */
    public String getIdnum() {
        return idnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.idNum
     *
     * @param idnum the value for user.idNum
     *
     * @mbggenerated
     */
    public void setIdnum(String idnum) {
        this.idnum = idnum == null ? null : idnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.occupation
     *
     * @return the value of user.occupation
     *
     * @mbggenerated
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.occupation
     *
     * @param occupation the value for user.occupation
     *
     * @mbggenerated
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.organization
     *
     * @return the value of user.organization
     *
     * @mbggenerated
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.organization
     *
     * @param organization the value for user.organization
     *
     * @mbggenerated
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.contactNum
     *
     * @return the value of user.contactNum
     *
     * @mbggenerated
     */
    public String getContactnum() {
        return contactnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.contactNum
     *
     * @param contactnum the value for user.contactNum
     *
     * @mbggenerated
     */
    public void setContactnum(String contactnum) {
        this.contactnum = contactnum == null ? null : contactnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.address
     *
     * @return the value of user.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.address
     *
     * @param address the value for user.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.summary
     *
     * @return the value of user.summary
     *
     * @mbggenerated
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.summary
     *
     * @param summary the value for user.summary
     *
     * @mbggenerated
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.credit
     *
     * @return the value of user.credit
     *
     * @mbggenerated
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.credit
     *
     * @param credit the value for user.credit
     *
     * @mbggenerated
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getPhonenum() == null ? other.getPhonenum() == null : this.getPhonenum().equals(other.getPhonenum()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getIsbinded() == null ? other.getIsbinded() == null : this.getIsbinded().equals(other.getIsbinded()))
            && (this.getCitinum() == null ? other.getCitinum() == null : this.getCitinum().equals(other.getCitinum()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getIdnum() == null ? other.getIdnum() == null : this.getIdnum().equals(other.getIdnum()))
            && (this.getOccupation() == null ? other.getOccupation() == null : this.getOccupation().equals(other.getOccupation()))
            && (this.getOrganization() == null ? other.getOrganization() == null : this.getOrganization().equals(other.getOrganization()))
            && (this.getContactnum() == null ? other.getContactnum() == null : this.getContactnum().equals(other.getContactnum()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getSummary() == null ? other.getSummary() == null : this.getSummary().equals(other.getSummary()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getPhonenum() == null) ? 0 : getPhonenum().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getIsbinded() == null) ? 0 : getIsbinded().hashCode());
        result = prime * result + ((getCitinum() == null) ? 0 : getCitinum().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getIdnum() == null) ? 0 : getIdnum().hashCode());
        result = prime * result + ((getOccupation() == null) ? 0 : getOccupation().hashCode());
        result = prime * result + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        result = prime * result + ((getContactnum() == null) ? 0 : getContactnum().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getSummary() == null) ? 0 : getSummary().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", phonenum=").append(phonenum);
        sb.append(", password=").append(password);
        sb.append(", isbinded=").append(isbinded);
        sb.append(", citinum=").append(citinum);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", idnum=").append(idnum);
        sb.append(", occupation=").append(occupation);
        sb.append(", organization=").append(organization);
        sb.append(", contactnum=").append(contactnum);
        sb.append(", address=").append(address);
        sb.append(", summary=").append(summary);
        sb.append(", credit=").append(credit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public User(String uid, String name, String password) {
        this.uid = uid;
        this.phonenum = "";
        this.password = password;
        this.isbinded = (byte) 0;
        this.citinum = "";
        this.name = name;
        this.sex = "男";
        this.birthday = "";
        this.idnum = "";
        this.occupation = "";
        this.organization = "";
        this.contactnum = "";
        this.address = "";
        this.summary = "这个用户很懒，什么也没留下";
        this.credit = 5000;
    }

    public User() {
    }

}