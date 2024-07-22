package com.university.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

import com.university.database.DatabaseConnection;

public class Crudtest {

	@Test
	public void testSelect() {
		try {
			// Obtain database connection
	        Connection conn = new DatabaseConnection("university").getconection();

	        // Insert data into the table
	        String insertQuery = "INSERT INTO students (name) VALUES(?)";
	        PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
	        insertStmt.setString(1, "Alex");
	        int rowsInserted = insertStmt.executeUpdate(); // Use executeUpdate for INSERT
	        System.out.println(rowsInserted + " row(s) inserted.");

	        // Query the inserted data
	        String selectQuery = "SELECT name FROM students WHERE name='Alex'";
	        
	        PreparedStatement selectStmt = conn.prepareStatement(selectQuery);
	        ResultSet res = selectStmt.executeQuery();
	        while (res.next()) {
	            String name = res.getString("name"); // Use column name or index
	            System.out.println(name);
	            assert "Alex".equals(name); // Adjust assertion to match inserted data
	        }
	        
	        // Clean up
	        res.close();
	        selectStmt.close();
	        insertStmt.close();
	        conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
