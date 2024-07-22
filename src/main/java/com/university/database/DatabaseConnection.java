package com.university.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnection
{
	private String host;
	private int port;
	private String user;
	private String password;
	private Connection conn;
	
	public DatabaseConnection(String dbName) throws SQLException {
		this.host= "localhost"; // where the db leaves
		this.port= 3306; // where the db lisens to
		this.user = "root"; // root user do not use
		this.password = "1070121415"; // the password
		Connection connection = DriverManager.getConnection(
			    "jdbc:mariadb://"+this.host+":"+this.port+"/"+dbName,
			    this.user, this.password
			);
		this.conn = connection;
	}
	
	public Connection getconection() {
		return this.conn;
	}
}
