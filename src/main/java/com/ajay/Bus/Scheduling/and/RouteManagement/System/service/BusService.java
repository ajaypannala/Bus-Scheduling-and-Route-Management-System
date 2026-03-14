package com.ajay.Bus.Scheduling.and.RouteManagement.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Bus;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.BusRepository;

@Service
public class BusService {
	@Autowired
	private BusRepository BusRepo;
	public Bus addBus(Bus bus) {
		return BusRepo.save(bus);
	}
	public Bus getBusById(int busId) {
		return BusRepo.findById(busId).get();
	}
	public List<Bus> getAllBuses(){
		return BusRepo.findAll();
		
	}
	public void deleteBus(int busId) {
		BusRepo.deleteById(busId);
	}
	public List<Bus> findByBusName(String busName){
		return BusRepo.findByBusName(busName);
	}
	public List<Bus> findByBusType(String busType){
		return BusRepo.findByBusType(busType);
	}

}
