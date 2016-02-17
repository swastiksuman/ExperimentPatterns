package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectMySql implements Connections{
	
	Connection connection;
	Statement statement;
	public ConnectMySql(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","elnino"); 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Override
	public Connection connectToDB() {
		// TODO Auto-generated method stub
		return connection;
	}
	
	public ResultSet executeQuery(String statement){
		return null;
	}
}
