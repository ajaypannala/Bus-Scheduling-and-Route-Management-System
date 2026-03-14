package com.ajay.Bus.Scheduling.and.RouteManagement.System.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookingId;
	private int seat;
	private LocalDateTime bookingDate;
	private String status;
	@ManyToOne
	@JoinColumn(name="schedule_id")
	private Schedule schedule;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Booking(int bookingId, int seat, LocalDateTime bookingDate, String status, Schedule schedule, User user) {
		super();
		this.bookingId = bookingId;
		this.seat = seat;
		this.bookingDate = bookingDate;
		this.status = status;
		this.schedule = schedule;
		this.user = user;
	}
	public Booking() {
		
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getSeat() {
		return seat;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", seat=" + seat + ", bookingDate=" + bookingDate + ", status="
				+ status + ", schedule=" + schedule + ", user=" + user + "]";
	}
	

}
