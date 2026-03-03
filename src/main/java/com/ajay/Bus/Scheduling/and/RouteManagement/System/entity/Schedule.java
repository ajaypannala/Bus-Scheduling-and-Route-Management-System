package com.ajay.Bus.Scheduling.and.RouteManagement.System.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Schedule {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int scheduleId;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	private int availabeSeats;
	private double price;
	public Schedule(int scheduleId, LocalDateTime departureTime, LocalDateTime arrivalTime, int availabeSeats,
			double price) {
		super();
		this.scheduleId = scheduleId;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.availabeSeats = availabeSeats;
		this.price = price;
	}
	public Schedule() {
		
	}
	public int getScheduleId() {
		return scheduleId;
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
				+ arrivalTime + ", availabeSeats=" + availabeSeats + ", price=" + price + "]";
	}
	
	

}
