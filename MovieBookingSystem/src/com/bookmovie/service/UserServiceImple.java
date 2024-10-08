package com.bookmovie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmovie.dao.UserDao;
import com.bookmovie.pojo.Movie;
import com.bookmovie.pojo.Orders;
import com.bookmovie.pojo.Shows;
import com.bookmovie.pojo.User;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean insertUser(User user) {
		return userDao.addUser(user);

	}

	@Override
	public User getUser(User user) {
		return userDao.getUser(user);
	}

	@Override
	public List<Movie> getMovies() {
		return userDao.getMovies();
	}

	@Override
	public List<Shows> getShow(int movieId) {
		return userDao.getShow(movieId);
	}

	
	@Override
		public String forgotPassword(String email) {
			return userDao.forgotPassword(email);
		}

	@Override
	public List<Orders> getOrdersForUser(int userId) {
		
		return userDao.getOrderForUser(userId);
	}

	

}
