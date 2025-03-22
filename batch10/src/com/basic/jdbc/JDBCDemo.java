package com.basic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step 1- Load the driver..
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// STep 2 - Get the connection
				String url = "jdbc:mysql://localhost:3306/batch10";
				String userName = "root";
				String password = "123456";
				Connection connection = DriverManager.getConnection(url, userName, password);

		// Step 3 - prepare requirement

				Statement stmt = connection.createStatement();

		// Step 4 - Get the result

				ResultSet rs = stmt.executeQuery("select * from student");

				while (rs.next()) {

					int idColumn = rs.getInt(1);
					System.out.println(idColumn);

					String studentName = rs.getString(2);
					System.out.println(studentName);

					String collegeName = rs.getString("college_name");
					System.out.println(collegeName);

					String studentAddress = rs.getString("address");
					System.out.println(studentAddress);

				}

		
		//Step 5- Close the  connection..
		connection.close();

	}

}
