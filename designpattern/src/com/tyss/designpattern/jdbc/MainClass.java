package com.tyss.designpattern.jdbc;

import com.tyss.designpatter.dao.EmployeeDAIOSpringJDBCImpl;
import com.tyss.designpatter.dao.EmployeeDAO;
import com.tyss.designpatter.dao.EmployeeDAOHibernateImpl;
import com.tyss.designpatter.dao.EmployeeDAOJDBCImpl;
import com.tyss.designpattern.bean.PrimaryInfo;
import com.tyss.designpattern.factory.GetDaoImpl;
import com.tyss.designpattern.service.EmployeeService;
import com.tyss.designpattern.service.EmployeeServiceImpl;

public class MainClass {
	public static void main(String[] args) {
//		EmployeeDB employee = new EmployeeDB();
//		Primary_info info = employee.getDetails();
//		
//		if(info != null) {
//			System.out.println(info.getName());
//			System.out.println(info.getId());
//			System.out.println(info.getPhoneNumber());
//			System.out.println(info.getDob());
//		}
		EmployeeService dao = new EmployeeServiceImpl();

		PrimaryInfo info = dao.getSingleRecord(10);
		System.out.println(info.getName());
		System.out.println(info.getPhoneNumber());
	}
}
