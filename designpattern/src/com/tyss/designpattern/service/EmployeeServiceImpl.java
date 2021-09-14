package com.tyss.designpattern.service;

import com.tyss.designpatter.dao.EmployeeDAO;
import com.tyss.designpattern.bean.PrimaryInfo;
import com.tyss.designpattern.factory.GetDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	GetDaoImpl daoImpl = new GetDaoImpl();
	EmployeeDAO dao = daoImpl.getDAOImpl();

	@Override
	public PrimaryInfo getSingleRecord(int id) {
		System.out.println(" Employee Service Layer");
		return dao.getSingleRecord(id);

	}

	@Override
	public void getAllRecords() {
		dao.getAllRecords();
	}

	@Override
	public void insertRecord(PrimaryInfo info) {
		dao.insertRecord(info);
	}

}
