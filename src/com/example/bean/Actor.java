package com.example.bean;

public class Actor {
	
	public static int ACTOR_COUNT=0;
	private String FirstName;
	private String LastName;
	
	public Actor(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.FirstName=firstName;
		this.LastName=lastName;
		ACTOR_COUNT++;
	}

	public String getFirstNaame(){
		return this.FirstName;
	}
	
	public String getLastName(){
		return this.LastName;
	}
}
