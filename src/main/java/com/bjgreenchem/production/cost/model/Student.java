package com.bjgreenchem.production.cost.model;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studId;
    private String name;
    private String email;
    private Date dob;
    private String phone;
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", email=" + email + ", dob=" + dob + ", phone=" + phone
				+ "]";
	}
   
}