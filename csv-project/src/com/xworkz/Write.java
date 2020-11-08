package com.xworkz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Write {
	private static String url = "jdbc:mysql://localhost:3306?user=root&password=root";
	static List<String> resultsetArray = new ArrayList<>();

	// Connection connection=DriverManager.getConnection(url);
	public static void main(String[] args) {
		fetchDataFromDataBase();
		try {
			printToCSV();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		
	}

	public static void fetchDataFromDataBase(){
		
		try {
			Connection connection=DriverManager.getConnection(url);
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from jdbcexamples.readcsv");
			int numCols=resultSet.getMetaData().getColumnCount();
			
			while(resultSet.next()){
				StringBuilder sb= new StringBuilder();
				
				for(int i=1;i<=numCols;i++){
					sb.append(String.format(String.valueOf(resultSet.getString(i)))+" ");
				}
				resultsetArray.add(sb.toString());
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public static void printToCSV() throws IOException {
		File csvOutputFile= new File("Write.csv");
		FileWriter fileWriter=new FileWriter(csvOutputFile,false);
		
		for (String mapping : resultsetArray) {
			fileWriter.write(mapping+"\n");
		}
		fileWriter.close();
	}
	
	
}
