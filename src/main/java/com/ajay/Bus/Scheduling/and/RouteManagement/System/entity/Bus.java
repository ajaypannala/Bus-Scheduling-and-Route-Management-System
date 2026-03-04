package com.ajay.Bus.Scheduling.and.RouteManagement.System.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Bus {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int busId;
	private int busNumber;
	private String busType;
	private int totalseats;
	private String status;
	@OneToMany(mappedBy ="bus",cascade = CascadeType.ALL)
	private List<Schedule> schedules;
	@OneToOne(mappedBy="assignBus")
	private Driver driver;
	
	
	public Bus(int busId, int busNumber, String busType, int totalseats, String status, List<Schedule> schedules,
			Driver driver) {
		super();
		this.busId = busId;
		this.busNumber = busNumber;
		this.busType = busType;
		this.totalseats = totalseats;
		this.status = status;
		this.schedules = schedules;
		this.driver = driver;
	}
	public Bus() {
		
	}
	public int getBusId() {
		return busId;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public List<Schedule> getSchedules() {
		return schedules;
	}
	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	
public void setTotalseats(int totalseats) {
	this.totalseats = totalseats;
}
public String getStatus() {
	return status;
}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getTotalseats() {
		return totalseats;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busNumber=" + busNumber + ", busType=" + busType + ", totalseats="
				+ totalseats + ", status=" + status + ", schedules=" + schedules + ", driver=" + driver + "]";
	}
	

}
