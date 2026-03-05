package com.ajay.Bus.Scheduling.and.RouteManagement.System.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Bus;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Route;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Schedule;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.BusRepository;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.RouteRepository;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.ScheduleRepository;

@Service
public class ScheduleService {
	@Autowired
	ScheduleRepository scheduleRepo;
	@Autowired
	RouteRepository routeRepo;
	@Autowired
	BusRepository busRepo;
	public Schedule createSchedule(Schedule schedule,int routeId,int busId) {
		Bus bus=busRepo.findById(busId).get();
		Route route=routeRepo.findById(routeId).get();
		schedule.setBus(bus);
		schedule.setRoute(route);
		return scheduleRepo.save(schedule);
	}
	public List<Schedule> getAllSchedule() {
		return scheduleRepo.findAll();
		
	}
	public List<Schedule> searchBuses(String source,String destination,LocalDate travelDate){
		return scheduleRepo.findByRouteSourceAndRouteDestinationAndTravelDate(source, destination,travelDate);
	}
	public List<Schedule> findByRouteRouteId(int routeId){
		return scheduleRepo.findByRouteRouteId(routeId);
	}
	public List<Schedule> findByBusBusId(int busId){
		return scheduleRepo.findByBusBusId(busId);
	}
	public List<Schedule> findByTravelDate(LocalDate travelDate){
		return scheduleRepo.findByTravelDate(travelDate);
	}

}
