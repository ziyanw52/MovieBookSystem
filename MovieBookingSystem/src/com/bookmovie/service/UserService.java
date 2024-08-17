package com.bookmovie.service;

import java.util.List;

import com.bookmovie.pojo.Movie;
import com.bookmovie.pojo.Orders;
import com.bookmovie.pojo.Shows;
import com.bookmovie.pojo.User;

public interface UserService {

	boolean insertUser(User user);
	User getUser(User user);	
	List<Movie> getMovies();
	List<Shows> getShow(int movieId);
	List<Orders> getOrdersForUser(int userId);
	
	String forgotPassword(String email);

}
