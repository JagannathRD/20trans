package com.xworkz.movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchStatementExample {

	public static void main(String[] args) {
		System.out.println("mms");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			
			Statement statement=con.createStatement();
			
			statement.addBatch("insert into jdbcExamples.festivals values(1,'Deepavali','November',2) ");
			statement.addBatch("update jdbcExamples.festivals set fest_name='Sankranti' where fest_id=8 ");
			statement.addBatch("delete from jdbcExamples.festivals where fest_id in(12,13)");
			
			
			statement.executeBatch();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("mme");
		
	}

}
