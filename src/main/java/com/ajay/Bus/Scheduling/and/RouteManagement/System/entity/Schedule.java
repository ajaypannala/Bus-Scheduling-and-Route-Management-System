package com.ajay.Bus.Scheduling.and.RouteManagement.System.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Schedule {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int scheduleId;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	private LocalDate travelDate;
	private int availabeSeats;
	private double price;
	@ManyToOne
	@JoinColumn(name="bus_id")
	private Bus bus;
	@ManyToOne
	@JoinColumn(name ="route_id")
	private Route route;
	@OneToMany(mappedBy="schedule",cascade=CascadeType.ALL)
	private List<Booking> bookings;
	
	public Schedule(int scheduleId, LocalDateTime departureTime, LocalDateTime arrivalTime, int availabeSeats,
			double price,LocalDate travelDate, Bus bus, Route route, List<Booking> bookings) {
		super();
		this.scheduleId = scheduleId;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.availabeSeats = availabeSeats;
		this.price = price;
		this.travelDate=travelDate;
		this.bus = bus;
		this.route = route;
		this.bookings = bookings;
	}
	public Schedule() {
		
	}
	public Route getRoute() {
		return route;
	}
	public LocalDate getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	public int getScheduleId() {
		return scheduleId;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getAvailabeSeats() {
		return availabeSeats;
	}
	public void setAvailabeSeats(int availabeSeats) {
		this.availabeSeats = availabeSeats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + ", travelDate=" + travelDate + ", availabeSeats=" + availabeSeats + ", price=" + price
				+ ", bus=" + bus + ", route=" + route + ", bookings=" + bookings + "]";
	}
	
	

}
