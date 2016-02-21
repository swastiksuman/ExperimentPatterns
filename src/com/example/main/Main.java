package com.example.main;

import java.util.List;

import com.example.dao.ActorDao;
import com.example.dao.ActorDaoImpl;
import com.example.dao.FilmDao;
import com.example.dao.FilmDaoImpl;
import com.example.bean.Actor;
import com.example.bean.Film;

public class Main {
	
	public static void main(String[] args){
		/*ActorDao actors = new ActorDaoImpl();
		List<Actor> actorNames = actors.getAllActor();
		for(Actor actor: actorNames){
			System.out.println("FirstName: "+actor.getFirstNaame()+" LastName: "+actor.getLastName());
		}*/

		/*FilmDao films = new FilmDaoImpl();
		List<Film> filmNames = films.getAllFilms();
		for(Film film:filmNames){
			System.out.println("Film Name: "+film.getTitle()+"Release Year: "+film.getRelease_year()+"Year: "+film.getRating());
		}*/
		ActorDao actors = new ActorDaoImpl();
		Actor actor = actors.getActor(32222);
		System.out.println("First Name: "+actor.getFirstNaame()+" Last Name: "+actor.getLastName());
	}
}
