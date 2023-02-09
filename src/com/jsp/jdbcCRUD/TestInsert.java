package com.jsp.jdbcCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jspider";
		String username = "root";
		String password = "root";
		String sql = "INSERT INTO student VALUES(1,'Sheetal','Sheetal@mail.com')";
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(url, username, password);

			Statement statement = connection.createStatement();

			statement.execute(sql);

			connection.close();

			System.out.println("Inserted...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
				System.out.println("Finelly close");

			}
		}

	}
}
