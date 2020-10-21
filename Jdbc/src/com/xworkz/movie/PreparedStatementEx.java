package com.xworkz.movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class PreparedStatementEx {

	public static void main(String[] args) {
	System.out.println("mms");
		try {
			PreparedStatementEx.movies();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("mme");
	}
	
	public static void movies() throws SQLException{
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		Connection connection= DriverManager.getConnection(url);
		
		PreparedStatement insertStatement=connection.prepareStatement("insert into jdbcExamples.Movies values(?,?,?,?)  ");
		PreparedStatement insertStatement2=connection.prepareStatement("insert into jdbcExamples.Movies values(?,?,?,?)  ");
		
		PreparedStatement updateStatement=connection.prepareStatement("update jdbcExamples.Movies set name=?,actors=? where movie_id=?  ");
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter id");
		insertStatement.setInt(1,scanner.nextInt() );
		System.out.println("Enter name");
		insertStatement.setString(2, scanner.next());
		System.out.println("enter actor");
		insertStatement.setString(3, scanner.next());
		System.out.println("enter budget");
		insertStatement.setInt(4, scanner.nextInt());
		
		System.out.println("enter id 2");
		insertStatement2.setInt(1,scanner.nextInt() );
		System.out.println("Enter name 2");
		insertStatement2.setString(2, scanner.next());
		System.out.println("enter actor 2");
		insertStatement2.setString(3, scanner.next());
		System.out.println("enter budget 2");
		insertStatement2.setInt(4, scanner.nextInt());
    	
    	
		System.out.println("Enter name");
		updateStatement.setString(1, scanner.next());
		System.out.println("enter actor");
		updateStatement.setString(2, scanner.next());
		System.out.println("enter id");
		updateStatement.setInt(3, scanner.nextInt());			
    	
    	scanner.close();
    	insertStatement.execute();
		updateStatement.execute();
		System.out.println(updateStatement);
		connection.close();
		
	}

}
