package com.tyss.gmailapp.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		java.sql.Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/gmail?user=root&password=root";
			con = DriverManager.getConnection(dburl);
			String query = "insert into account values (10101,'Pratik','Pratik','PKPRATK@GMAIL.COM')";
			stmt = con.createStatement();
			int result = stmt.executeUpdate(query);
			// step:4
			if (result != 0) {
				System.out.println(result + " Number of rows affected!!");
				System.out.println("Insertion Successful");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				
				if (stmt != null) {
					stmt.close();					
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
