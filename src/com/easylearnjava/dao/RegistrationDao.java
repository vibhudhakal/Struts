package com.easylearnjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.easylearnjava.util.DataBaseConnectionCenter;

public class RegistrationDao {

	public String getPassword(String userName) {

		DataBaseConnectionCenter dbcc = new DataBaseConnectionCenter();
		Connection connection = null;
		PreparedStatement pStmt = null;
		String passwordFromDB = null;
		try {

			connection = dbcc.getDBConnectionObject();

			pStmt = connection.prepareStatement("SELECT USER_PASSWORD FROM register where USER_NAME = ?");
			pStmt.setString(1, userName);

			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				passwordFromDB = rs.getString("USER_PASSWORD");
				System.out.println("the password is  : " + passwordFromDB);

				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (!connection.isClosed()) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return passwordFromDB;

	}

	public String registerRecord(String userName, String password) {

		DataBaseConnectionCenter dbcc = new DataBaseConnectionCenter();
		Connection connection = null;
		PreparedStatement pStmt = null;
		String passwordFromDB = password;
		try {

			connection = dbcc.getDBConnectionObject();

			pStmt = connection.prepareStatement("INSERT INTO register values (?, ?)");
			pStmt.setString(1, userName);
			pStmt.setString(2, password);
			pStmt.execute();

			
			  pStmt = connection.prepareStatement("SELECT USER_PASSWORD FROM register where user_name = ?");
			  pStmt.setString(1, userName);
			  ResultSet rs = pStmt.executeQuery();
			  while (rs.next()) {
					passwordFromDB = rs.getString("USER_PASSWORD");
					System.out.println("the password is  : " + passwordFromDB);
			  }
			 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (!connection.isClosed()) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return passwordFromDB;

	}

}
