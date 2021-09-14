package com.tyss.designpattern.service;

import com.tyss.designpattern.bean.PrimaryInfo;

public interface EmployeeService {

	public PrimaryInfo getSingleRecord(int id);

	public void getAllRecords();

	public void insertRecord(PrimaryInfo info);

}
