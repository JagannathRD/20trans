package com.xworkz.movie;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetadataExamples {

	public static void main(String[] args) {
		System.out.println("mms");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root &password=root");
			
		DatabaseMetaData data=	con.getMetaData();
		
		System.out.println(data.getCatalogs());
		System.out.println(data.getDatabaseProductName());
		System.out.println(data.getURL());
		System.out.println(data.getDriverVersion());
		System.out.println(data.getDatabaseMajorVersion());
		
		ResultSet resultSetMetaData=	data.getColumns(null, null, "festivals", null);
		ResultSet resultSet2=	data.getColumns(null, null, "movies", null);
		
		while(resultSetMetaData.next()){
			System.out.print(resultSetMetaData.getString(1)+" ");
			System.out.print(resultSetMetaData.getString(2)+" ");
			System.out.print(resultSetMetaData.getString(3)+" ");
			System.out.println(resultSetMetaData.getString(4)+" ");
		}
		
		while(resultSet2.next()){
			System.out.print(resultSet2.getString(1)+" ");
			System.out.print(resultSet2.getString(2)+" ");
			System.out.print(resultSet2.getString(3)+" ");
			System.out.println(resultSet2.getString(4)+" ");
		}
		System.out.println();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("mme");

	}

}
