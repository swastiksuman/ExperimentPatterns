package com.example.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class ConnectMySql implements Connections{
	
	Connection connection;
	Statement statement;
	
	
	public ConnectMySql(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Properties prop = new Properties();
			prop.load(new FileInputStream(propFilePath));
			String connectionURL = prop.getProperty("MySQLURL");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			connection=DriverManager.getConnection(connectionURL,username,password); 
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}	
	}
	
	@Override
	public Connection connectToDB() {
		return connection;
	}
	
	public ResultSet executeQuery(String statement){
		return null;
	}

	@Override
	public void flushConnection() {
		connection = null;
	}
}
