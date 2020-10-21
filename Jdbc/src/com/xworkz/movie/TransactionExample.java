package com.xworkz.movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionExample {

	public static void main(String[] args) {
		System.out.println("mms");
		
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		try {
			con=DriverManager.getConnection(url);
			con.setAutoCommit(false);
			Statement statement=con.createStatement();
			statement.execute("insert into jdbcExamples.festivals values(22,'Amasi','everyMonth',1)");
			
			con.commit();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("mme");

	}

}
