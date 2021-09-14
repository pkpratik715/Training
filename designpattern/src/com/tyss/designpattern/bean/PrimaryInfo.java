package com.tyss.designpattern.bean;

import java.io.Serializable;
import java.util.Date;

public class PrimaryInfo implements Serializable {

	private int id;

	private String name;

	private Date dob;

	private long phone;

	@Override
	public String toString() {
		return "PrimaryInfo [id=" + id + ", name=" + name + ", dob=" + dob + ", phone=" + phone + "]";
	}
	public int getId() {
		return id;
	}

	public void setId(int id) throws Exception {
		if (id != 0) {

			this.id = id;
		} else {
			throw new Exception("invalid ID");
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getPhoneNumber() {
		return phone;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phone = phoneNumber;
	}

}
