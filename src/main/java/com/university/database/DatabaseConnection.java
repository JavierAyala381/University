package com.university.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection
{
	private String host;
	private int port;
	private String user;
	private String password;
	private Connection conn;
	
	public DatabaseConnection(String dbName) throws SQLException {
		this.host= "localhost";
		this.port= 3306;
		this.user = "root";
		this.password = "1070121415";
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
