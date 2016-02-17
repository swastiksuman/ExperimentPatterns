package com.example.dao;
import java.util.List;

import com.example.bean.Film;

public interface FilmDao {
	
	public List<Film> getAllFilms();
	public Film getFilmByID();

}
