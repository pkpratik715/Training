package com.tyss.designpattern.factory;

import com.tyss.designpatter.dao.EmployeeDAIOSpringJDBCImpl;
import com.tyss.designpatter.dao.EmployeeDAO;
import com.tyss.designpatter.dao.EmployeeDAOHibernateImpl;
import com.tyss.designpatter.dao.EmployeeDAOJDBCImpl;

public class GetDaoImpl {

	String type = "jdbc";
	
	public EmployeeDAO getDAOImpl() {
		
		if(type.equalsIgnoreCase("jdbc")) {
			return new EmployeeDAOJDBCImpl();
			
		}else if( type.equalsIgnoreCase("hibernate")) {
			return new EmployeeDAOHibernateImpl();
			
		}else if(type.equalsIgnoreCase("springjdbc")) {
			return new EmployeeDAIOSpringJDBCImpl();
		}
		
		return null;
	}
}
