package com.ajay.Bus.Scheduling.and.RouteManagement.System.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Schedule;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.service.ScheduleService;
@CrossOrigin(origins="*")
@RestController
public class ScheduleController {
	
	@Autowired
	ScheduleService scheduleservice;
	@GetMapping("/getSchedule")
	public List<Schedule> getRoutes(String source,
	        String destination,
	        LocalDate travelDate) {
		return scheduleservice.searchBuses(source, destination, travelDate);
	}
	@GetMapping("getSchedule/{busId}")
	public List<Schedule> getRouteById(@PathVariable int busId){
		return scheduleservice.findByBusBusId(busId);
		
	}

}
