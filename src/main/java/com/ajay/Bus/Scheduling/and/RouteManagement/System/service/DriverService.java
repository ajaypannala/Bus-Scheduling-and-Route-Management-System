package com.ajay.Bus.Scheduling.and.RouteManagement.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Driver;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.DriverRepository;

@Service
public class DriverService {
	@Autowired
	DriverRepository driverRepo;
	public Driver addDriver(Driver driver) {
		return driverRepo.save(driver);
	}
	public Driver getDriverById(int driverId) {
		return driverRepo.findById(driverId).get();
	}
	public List<Driver> getAllDrivers(){
		return driverRepo.findAll();
	}
	public void deleteDriver(int driverId) {
		driverRepo.deleteById(driverId);
	}
	public List<Driver> findByDriverName(String driverName){
		return driverRepo.findByDriverName(driverName);
	}

}
