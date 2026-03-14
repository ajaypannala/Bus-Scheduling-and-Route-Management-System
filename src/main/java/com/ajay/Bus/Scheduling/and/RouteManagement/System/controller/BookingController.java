package com.ajay.Bus.Scheduling.and.RouteManagement.System.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Booking;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.service.BookingService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	BookingService bookingservice;
	@PostMapping("/book")
	public Booking bookTicket(@RequestParam int userId,@RequestParam int scheduleId,@RequestParam int seatNumber,@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")LocalDateTime bookingDate) {
		return bookingservice.bookTicket(userId, scheduleId, seatNumber,bookingDate);
		
	}

}
