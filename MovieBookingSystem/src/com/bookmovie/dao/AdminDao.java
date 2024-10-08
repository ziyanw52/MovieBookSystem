package com.bookmovie.dao;

import java.util.List;

import com.bookmovie.pojo.Admin;
import com.bookmovie.pojo.Hall;
import com.bookmovie.pojo.Movie;
import com.bookmovie.pojo.Orders;
import com.bookmovie.pojo.Shows;

public interface AdminDao {

Admin getAdmin(Admin admin);
	
	Movie getMovie(int movieId);
	boolean addMovie(Movie movie);
	boolean updateMovie(Movie movie);
	void deleteMovie(int movieId);
	List<Movie> showMovies();
	
	Hall getHall(int hallId);
	boolean addHall(Hall hall);
	boolean updateHall(Hall hall);
	void deleteHall(int hallId);
	List<Hall> showHalls();
	
	Shows getShow(int showId);
	boolean addShow(Shows shows);
	boolean updateShow(Shows shows);
	void deleteShows(int showId);
	List<Shows> showsAll();
	
	Orders getOrder(int ticketId);
	List<Orders> showOrders();
	boolean updateOrders(Orders orders);
	void deleteOrders(int ticketId);
	boolean addOrders(Orders orders);
	
}
