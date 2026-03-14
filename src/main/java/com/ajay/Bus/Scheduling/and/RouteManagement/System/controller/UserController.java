package com.ajay.Bus.Scheduling.and.RouteManagement.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Booking;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.User;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.service.UserService;

import jakarta.servlet.http.HttpSession;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/UserAPI")
public class UserController {
	@Autowired
	UserService userservice;
	@PostMapping("/registerUser")
	public String  registerUser(@RequestBody User user) {
		 userservice.saveUser(user);
		return "registration Successfull";
	}
	@PostMapping("/login")
	public String login(@RequestBody User user,HttpSession session) {
		User dbUser=userservice.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if(dbUser != null) {
			session.setAttribute("user", dbUser);
			return "Login Successful"; 
		}
		return "Invalid Credintials";
	}
	@GetMapping("/Profile/{userId}")
	public User getUser(@PathVariable int userId) {
		return userservice.getUserById(userId);
	}
	@GetMapping("/view/{userId}")
	public List<Booking> viewUserBooking(@PathVariable int userId){
		return userservice.ViewBookingdByUserId(userId);
		
	}

}
