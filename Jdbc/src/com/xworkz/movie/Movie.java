package com.xworkz.movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Movie {

	public static void main(String[] args) {
		
		try {
			insertMovie();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

	public static void insertMovie() throws ClassNotFoundException {
		
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		Class.forName("com.mysql.cj.jdbc.Driver"); //1.load and register
		try (
		Connection connection=	DriverManager.getConnection(url)){		//2.establish collection
			try( Statement statement = connection.createStatement()){  //3.create statement
//				statement.execute("insert into jdbcExamples.Movies values(4,'infinity-war','multistarer',2000)");
//				statement.execute("insert into jdbcExamples.Movies values(3,'dilbechara','ssr',20)");
//				statement.execute("update jdbcExamples.Movies set name='mm' where movie_id=2");
				statement.execute("delete from jdbcExamples.Movies where name='mm' "); //4.execute sql query
			}
			
			connection.close();//5.close connection
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
	}
}
