package com.ajay.Bus.Scheduling.and.RouteManagement.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Booking;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Schedule;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.BookingRepository;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.ScheduleRepository;

@Service
public class BookingService {
	@Autowired
	private BookingRepository bookingRepo;
	@Autowired
	ScheduleRepository scheduleRepo;
	public Booking bookTicket(Booking booking) {
		return bookingRepo.save(booking);
	}
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
	public Booking bookTicket(Booking booking, int scheduleId) {
		Schedule schedule=scheduleRepo.findById(scheduleId).get();
		booking.setSchedule(schedule);
		return bookingRepo.save(booking);
	}
	public List<Booking> getUserByBookings(int userId){
		return bookingRepo.findByUserUserId(userId);
	}
	
	

}
