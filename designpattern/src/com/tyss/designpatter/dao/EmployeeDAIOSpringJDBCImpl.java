package com.tyss.designpatter.dao;

import com.tyss.designpattern.bean.PrimaryInfo;

public class EmployeeDAIOSpringJDBCImpl implements EmployeeDAO{

	@Override
	public PrimaryInfo getSingleRecord(int id) {
		System.out.println(" Spring JDBC impl");
		return null;
	}

	@Override
	public void getAllRecords() {
		System.out.println(" Spring JDBC impl");
		
	}

	@Override
	public void insertRecord(PrimaryInfo info) {
		System.out.println(" Spring JDBC impl");
		
	}

}
