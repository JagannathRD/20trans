package com.xworkz.movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExecute {

	public static void main(String[] args) {
		
		try {
			StatementExecute.fetchData();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	
	public static void fetchData() throws SQLException{

		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		
		Statement statement= connection.createStatement();
		ResultSet resultSet= statement.executeQuery("select * from jdbcExamples.Movies");
		
		
		while(resultSet.next()){
			String id= resultSet.getString(1);
			String name= resultSet.getString(2);
			
			String actors=resultSet.getString(3);
			int budget=resultSet.getInt(4);
			System.out.println(id+" "+name+" "+actors+" "+budget);
		}
		connection.close();
		
		System.out.println();
		
	}

}
