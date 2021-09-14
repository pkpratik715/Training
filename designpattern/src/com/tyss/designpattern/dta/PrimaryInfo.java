package com.tyss.designpattern.dta;

import java.io.Serializable;
import java.sql.Date;

public class PrimaryInfo implements Serializable {
	private int id;
	private String name;
	private Date dob;
	private long phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		
		this.id = id;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
