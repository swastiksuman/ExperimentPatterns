package com.example.factory;

import com.example.db.ConnectMySql;
import com.example.db.Connections;
import com.mysql.jdbc.Connection;

public class MySqlConnectionFactory implements ConnectionsFactory{

	@Override
	public  Connections getConnection() {
		// TODO Auto-generated method stub
		return new ConnectMySql();
	}

	@Override
	public Connections destroyConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
