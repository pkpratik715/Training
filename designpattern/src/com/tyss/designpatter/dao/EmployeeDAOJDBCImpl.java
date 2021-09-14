package com.tyss.designpatter.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.tyss.designpattern.bean.PrimaryInfo;

public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	@Override
	public PrimaryInfo getSingleRecord(int id) {
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		PrimaryInfo info = new PrimaryInfo();
		try {
			// step 1
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// step 2
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=root");

			String query = " select * from primary_info where id = 10";

			// step 3
			statement = connection.createStatement();

			result = statement.executeQuery(query);

			// step 4
			while (result.next()) {
				info.setId(result.getInt("id"));
				info.setName(result.getString("name"));
				info.setDob(result.getDate("dob"));
				info.setPhoneNumber(result.getLong("phoneNumber"));
			}

			return info;
		} catch (Exception e) {

			e.printStackTrace();
		}

		finally {
			try {
				if (connection != null) {
					connection.close();

				}
				if (statement != null) {
					statement.close();
				}

				if (result != null) {
					result.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return info;

		
	}

	@Override
	public void getAllRecords() {
		System.out.println("JDBC IMPL");
		
	}

	@Override
	public void insertRecord(PrimaryInfo info) {
		System.out.println("JDBC IMPL");
		
	}

}
