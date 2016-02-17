package com.example.dao;

import java.util.List;

import com.example.bean.Actor;

public interface ActorDao {
	
	public List<Actor> getAllActor();
	public Actor getActor(int actorID);
	public void updateActor(int actorID);
	public void deleteActor(int actorID);
}

