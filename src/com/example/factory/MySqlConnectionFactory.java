package com.example.factory;

import com.example.db.ConnectMySql;
import com.example.db.Connections;
import com.mysql.jdbc.Connection;

public class MySqlConnectionFactory implements ConnectionsFactory{

	@Override
	public  Connections getConnection() {
		return new ConnectMySql();
	}

	@Override
	public Connections destroyConnection() {
		return null;
	}

}
