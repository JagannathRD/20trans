package com.xworkz.movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchPreparedStatementExample {

	public static void main(String[] args) {
		
		System.out.println("mms");
		
		Connection connection = null ;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			
			PreparedStatement preparedStatement=connection.prepareStatement("insert into jdbcExamples.festivals values(?,?,?,?)");
			PreparedStatement updatePreparedStatement=connection.prepareStatement("update jdbcExamples.festivals set fest_name=? where fest_id=?");
			PreparedStatement deleteStatement=connection.prepareStatement("delete from jdbcExamples.festivals where fest_id=?");
			
			deleteStatement.setInt(1, 1);
			deleteStatement.addBatch();
			
			updatePreparedStatement.setString(1, "Shivaratri");
			updatePreparedStatement.setInt(2,8);
			
			updatePreparedStatement.addBatch();
			
			preparedStatement.setInt(1, 15);
			preparedStatement.setString(2, "Christmas");
			preparedStatement.setString(3, "dec");
			preparedStatement.setInt( 4, 1);
			
		    preparedStatement.addBatch();
			
			preparedStatement.setInt(1,16);
			preparedStatement.setString(2, "Dasara");
			preparedStatement.setString(3, "oct");
			preparedStatement.setInt( 4, 1);
			
			
			preparedStatement.addBatch();
			
			updatePreparedStatement.addBatch();
			deleteStatement.executeBatch();
			
		preparedStatement.executeBatch();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
				
		
		
		
		System.out.println("mme");
	}

}
