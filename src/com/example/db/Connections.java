package com.example.db;

import java.sql.Connection;



public interface Connections {
	public Connection connectToDB();
	public void flushConnection();
	public final String propFilePath = System.getProperty("user.dir")+"\\config\\sql.properties";
}
