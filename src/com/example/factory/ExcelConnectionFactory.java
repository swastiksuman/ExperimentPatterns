package com.example.factory;

import com.example.db.ConnectMySql;
import com.example.db.Connections;
import com.mysql.jdbc.Connection;

public class ExcelConnectionFactory implements ConnectionsFactory{
	
	@Override
	public Connections getConnection() {
		return null;
	}

	@Override
	public Connections destroyConnection() {
		return null;
	}

}
