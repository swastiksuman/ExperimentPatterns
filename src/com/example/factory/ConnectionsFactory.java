package com.example.factory;

import com.example.db.Connections;
import com.mysql.jdbc.Connection;

public interface ConnectionsFactory {
	
	public Connections getConnection();
	public Connections destroyConnection();
}
