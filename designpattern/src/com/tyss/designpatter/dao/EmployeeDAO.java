package com.tyss.designpatter.dao;

import com.tyss.designpattern.bean.PrimaryInfo;

public interface EmployeeDAO {

	public PrimaryInfo getSingleRecord(int id);
	
	public void getAllRecords();
	
	public void insertRecord(PrimaryInfo info);
	
}
