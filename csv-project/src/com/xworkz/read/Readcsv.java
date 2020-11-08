package com.xworkz.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Readcsv {
	public static void main(String[] args) {
		String filename="Players.csv";
		File file=new File(filename); 
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		Connection connection=null;
		Scanner inputStream = null;
		
		
		
		try {
			inputStream = new Scanner(file);
			inputStream.next();
			while(inputStream.hasNext()){
				String data=inputStream.next();
				String[] values=data.split(",");
				String name=values[0];
				String type=values[1];
				String age=values[2];
				String city=values[3];
				try {
					connection=DriverManager.getConnection(url);
					PreparedStatement preparedStatement=connection.prepareStatement("insert into jdbcexamples.readcsv values(?,?,?,?)");
					Statement statement=connection.createStatement();
					ResultSet resultSet =statement.executeQuery("select * from jdbcexamples.readcsv");
					
					preparedStatement.setString(1, name);
					preparedStatement.setString(2, type);
					Integer intAge=Integer.parseInt(age);
					preparedStatement.setInt(3,intAge );
					preparedStatement.setString(4, city);
				
//					preparedStatement.addBatch();
//					preparedStatement.executeBatch();
					
					
					
					while(resultSet.next()){
						String na=resultSet.getString(1);
						String t=resultSet.getString(2);
						Integer a=resultSet.getInt(3);
						String c=resultSet.getString(4);
						System.out.println(na+t+a+c);
					}
					
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				 
		}} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}finally{
			inputStream.close();}
		
		}
		
	}

