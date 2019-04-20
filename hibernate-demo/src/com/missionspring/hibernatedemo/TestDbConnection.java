package com.missionspring.hibernatedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDbConnection {

	public static void main(String[] args) {

		String connection = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";

		String username = "hbstudent";
		String password = "hbstudent";

		try {
			System.out.println("Connecting to DB " + connection);
			Connection dbConn = DriverManager.getConnection(connection, username, password);
			System.out.println("SUCCESS!!");
		} catch (SQLException e) {
			System.out.println("FAILED :(");
			e.printStackTrace();
		}

	}

}
