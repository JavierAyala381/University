package com.university;
import com.university.database.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		try {
			Connection conn = new DatabaseConnection("university").getconection();
			Statement stmt = conn.createStatement();
			ResultSet res =stmt.executeQuery("SELECT * FROM students");
			while (res.next()) {
                System.out.println(res.getString("name"));
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
