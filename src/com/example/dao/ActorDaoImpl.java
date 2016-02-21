package com.example.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.db.ConnectMySql;
import com.example.db.Connections;
import com.example.factory.ConnectionsFactory;
import com.example.factory.MySqlConnectionFactory;
import com.example.bean.Actor;

public class ActorDaoImpl implements ActorDao{
	
	ConnectionsFactory connectDB;
	Actor actor;
	Connections connectionForDB;
	
	@Override
	public List<Actor> getAllActor() {
		// TODO Auto-generated method stub
		List<Actor> actors = new ArrayList<Actor>();
		//connectDB = new ConnectMySql();
		connectDB = new MySqlConnectionFactory();
		//Connection connection = connectDB.connectToDB();
		Connection connection = connectDB.getConnection().connectToDB();
		
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("Select first_name, last_name from actor");
			while(rs.next()){
				actor = new Actor(rs.getObject(1).toString(), rs.getObject(2).toString());
				actors.add(actor);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return actors;
	}

	@Override
	public Actor getActor(int actorID) {
		// TODO Auto-generated method stub
		connectDB = new MySqlConnectionFactory();
		Connection connection = connectDB.getConnection().connectToDB();
		Statement statement;
		try{
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("Select first_name, last_name from actor where actor_id="+actorID);
			System.out.println(rs.first());
			actor= new Actor(rs.getObject(1).toString(), rs.getObject(2).toString());
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return actor;
	}

	@Override
	public void updateActor(int actorID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteActor(int actorID) {
		// TODO Auto-generated method stub
		
	}

}
