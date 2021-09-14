package com.tyss.designpattern.dao;

import com.tyss.designpattern.dta.PrimaryInfo;

public interface EmployeeDAO {
	
	public PrimaryInfo getSingleRecord(int id);
	
	public void getAllRecords();
	
	public void insertRecord(PrimaryInfo info);

}
