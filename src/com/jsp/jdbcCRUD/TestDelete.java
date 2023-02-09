package com.jsp.jdbcCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jspider";
		String username = "root";
		String password = "root";
		String sql = "DELETE FROM student where id = 1";
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(url, username, password);

			Statement statement = connection.createStatement();

			statement.execute(sql);

			connection.close();

			System.out.println("Deleted....");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
