package com.easylearnjava.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class DataBaseConnectionCenter {

	private Connection conn;
	private String driver;
	private String url;
	private String username;
	private String password;

	public static void main(String[] args) {
		DataBaseConnectionCenter dbcc = new DataBaseConnectionCenter();
		dbcc.createDBConnection();
	}
	
	
	public Connection getDBConnectionObject() {		

		try {
			ResourceBundle rs = ResourceBundle.getBundle("com/easylearnjava/propertyfiles/dbParameters");
			driver = rs.getString("DB_DRIVER");
			url = rs.getString("DB_URL");
			username = rs.getString("DB_USER");
			password = rs.getString("DB_PASSWORD");

			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public void closeConnection(){
		try{
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	

	public void createDBConnection() {

		try {
			ResourceBundle rs = ResourceBundle.getBundle("dbParameters");
			driver = rs.getString("DB_DRIVER");
			url = rs.getString("DB_URL");
			username = rs.getString("DB_USER");
			password = rs.getString("DB_PASSWORD");

			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			System.out.println(conn.isClosed());
			
			if(!conn.isClosed()){
				conn.close();
			}
			System.out.println(conn.isClosed());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
