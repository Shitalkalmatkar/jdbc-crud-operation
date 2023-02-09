package com.jsp.jdbcCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/jspider";
		String username = "root";
		String Password = "root";
		String sql = "update student set email='shital@email.com'where id=1";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(url, username, Password);

			Statement statement = connection.createStatement();

			statement.execute(sql);

			statement.close();

			System.out.println("updatedd!!!!!!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
