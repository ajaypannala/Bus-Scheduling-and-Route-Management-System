package com.ajay.Bus.Scheduling.and.RouteManagement.System.entity;

import jakarta.persistence.Entity;

@Entity
public class Driver {
	private int driverId;
	private String driverName;
	private String licenceNumber;
	private String phone;
	public Driver(int driverId, String driverName, String licenceNumber, String phone) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.licenceNumber = licenceNumber;
		this.phone = phone;
	}
	public Driver() {
		
	}
	public int getDriverId() {
		return driverId;
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
				+ ", phone=" + phone + "]";
	}
	
	

}
