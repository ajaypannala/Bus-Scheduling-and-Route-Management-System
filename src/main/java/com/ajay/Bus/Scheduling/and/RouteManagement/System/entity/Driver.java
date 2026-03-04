package com.ajay.Bus.Scheduling.and.RouteManagement.System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Driver {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int driverId;
	private String driverName;
	private String licenceNumber;
	private String phone;
	@OneToOne
	@JoinColumn(name="bus_id")
	private Bus assignBus;
	
	public Driver(int driverId, String driverName, String licenceNumber, String phone, Bus assignBus) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.licenceNumber = licenceNumber;
		this.phone = phone;
		this.assignBus = assignBus;
	}
	public Driver() {
		
	}
	public int getDriverId() {
		return driverId;
	}
	public Bus getAssignBus() {
		return assignBus;
	}
	public void setAssignBus(Bus assignBus) {
		this.assignBus = assignBus;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getLicenceNumber() {
		return licenceNumber;
	}
	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", licenceNumber=" + licenceNumber
				+ ", phone=" + phone + ", assignBus=" + assignBus + "]";
	}
	
	

}
