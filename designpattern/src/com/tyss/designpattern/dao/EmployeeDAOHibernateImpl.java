package com.tyss.designpattern.dao;

import com.tyss.designpattern.dta.PrimaryInfo;

public class EmployeeDAOHibernateImpl implements EmployeeDAO{

	@Override
	public PrimaryInfo getSingleRecord(int id) {
		System.out.println("HibernateImpl");
		return null;
	}

	@Override
	public void getAllRecords() {
		System.out.println("HibernateImpl");
		
	}

	@Override
	public void insertRecord(PrimaryInfo info) {
		System.out.println("HibernateImpl");
		
	}
	
	

}
