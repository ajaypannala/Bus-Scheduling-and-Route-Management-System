package com.ajay.Bus.Scheduling.and.RouteManagement.System.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Booking;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Route;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Schedule;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.User;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.BookingRepository;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.RouteRepository;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.ScheduleRepository;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.UserRepository;

@Service
public class BookingService {
	@Autowired
	private BookingRepository bookingRepo;
	@Autowired
	private ScheduleRepository scheduleRepo;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RouteRepository routeRepo;
	
	public List<Booking> getAllBookings(){
		return bookingRepo.findAll();
	}
	public Booking getBookingById(int bookingId) {
		return bookingRepo.findById(bookingId).get();
	}
	public void cancellBooking(int bookingId) {
		 bookingRepo.deleteById(bookingId);
	}
	public List<Booking> findByUserUserId(int userId){
		return bookingRepo.findByUserUserId(userId);
	}
	public List<Booking> findByScheduleScheduleId(int scheduleId){
		return bookingRepo.findByScheduleScheduleId(scheduleId);
	}
	public Booking bookTicket(int userId,int scheduleId,int seatNumber,LocalDateTime bookingDate) {
		User user=userRepo.findById(userId).get();
		Schedule schedule=scheduleRepo.findById(scheduleId).get();
		
		if(user==null&&schedule==null) {
			throw new RuntimeException("Invalid Booking Details");
		}
		List<Booking> bookings=bookingRepo.findByScheduleScheduleId(scheduleId);
		for(Booking b:bookings) {
			if(b.getSeat()== seatNumber) {
				throw new RuntimeException("Seat Already Booked");
			}
		}
		Booking booking=new Booking();
		booking.setUser(user);
		booking.setSchedule(schedule);
		booking.setSeat(seatNumber);
		booking.setBookingDate(bookingDate);
		return bookingRepo.save(booking);
		
	}
	public List<Booking> getUserByBookings(int userId){
		return bookingRepo.findByUserUserId(userId);
	}
	
	

}
