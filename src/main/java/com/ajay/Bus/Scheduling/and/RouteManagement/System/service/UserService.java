package com.ajay.Bus.Scheduling.and.RouteManagement.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Booking;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.User;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.BookingRepository;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	BookingRepository bookingRepo;
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	public User getUserById(Integer userId) {
		return userRepo.findById(userId).get();
	}
	public void deleteUser(int userId) {
		userRepo.deleteById(userId);
	}
	public User findByEmail(String email,String password) {
		User user= userRepo.findByEmail(email);
		if(user != null && user.getPassword().equals(password)) {
		return user;}
		else {
			return null;
		}
	}
	public User findByEmailAndPassword(String email,String password) {
		return userRepo.findByEmailAndPassword(email, password);
	}
	public User findByRole(String role) {
		return userRepo.findByRole(role);
	}
	public List<Booking> ViewBookingdByUserId(int userId){
		return bookingRepo.findByUserUserId(userId);
	}

}
