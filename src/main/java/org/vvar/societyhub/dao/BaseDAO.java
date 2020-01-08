package org.vvar.societyhub.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	protected Connection connection;
	
	protected void connect() {
		try {
			if(connection==null || connection.isClosed()) {
				Class.forName("com.mysql.jdbc.Driver");
				String jdbcUrl = "jdbc:mysql://localhost:3306/society_mysqldb";
				String jdbcUsername = "phpmyadmin";
				String jdbcPassword = "phpmyadmin";
				connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
				System.out.println("Connect");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	protected void disconnect() {
		try {
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	protected void connect() {
//		try {
//			if(connection==null || connection.isClosed()) {
//				Class.forName("com.mysql.jdbc.Driver");
////				Class.forName("com.mysql.jdbc.Driver");
//				connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
//				System.out.println("Connect");
//			}
//		} catch (SQLException | ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//	protected void disconnect() {
//		try {
//			if(connection != null && !connection.isClosed()) {
//				connection.close();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
}
