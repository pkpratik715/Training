package com.tyss.designpatter.dao;

import com.tyss.designpattern.bean.PrimaryInfo;

public class EmployeeDAOHibernateImpl implements EmployeeDAO{

	@Override
	public PrimaryInfo getSingleRecord(int id) {
		System.out.println("Hibernate IMPL");
		return null;
	}

	@Override
	public void getAllRecords() {
		System.out.println("Hibernate IMPL");
		
	}

	@Override
	public void insertRecord(PrimaryInfo info) {
		System.out.println("Hibernate IMPL");
		
	}

}
