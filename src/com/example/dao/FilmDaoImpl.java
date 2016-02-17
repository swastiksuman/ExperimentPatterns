package com.example.dao;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.bean.Film;
import com.example.db.ConnectMySql;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

public class FilmDaoImpl implements FilmDao{
	
	ConnectMySql connectDB;
	Film film;
	
	@Override
	public List<Film> getAllFilms() {
		// TODO Auto-generated method stub
		List<Film> films = new ArrayList<Film>();
		connectDB = new ConnectMySql();
		Connection con = (Connection) connectDB.connectToDB();
		try{
			Statement stmnt = con.createStatement();
			ResultSet rs = (ResultSet) stmnt.executeQuery("Select title, release_year, rating from film");
			
			while(rs.next()){
				film = new Film();
				film.setTitle(rs.getString(1));
				film.setRelease_year(rs.getString(2));
				film.setRating(rs.getString(3));
				films.add(film);
			}
			
			return films;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Film getFilmByID() {
		// TODO Auto-generated method stub
		return null;
	}

}
