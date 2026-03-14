package com.ajay.Bus.Scheduling.and.RouteManagement.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Route;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.repository.RouteRepository;

@Service
public class RouteService {
	@Autowired
	RouteRepository routeRepo;
	public Route saveRoute(Route route) {
		return routeRepo.save(route);
	}
	public Route getRouteById(int routeId) {
		return routeRepo.findById(routeId).get();
	}
	public List<Route> getAllRoute(){
		return routeRepo.findAll();
	}
	public List<Route> findBySourceAndDestination(String source,String destination){
		return routeRepo.findBySourceAndDestination(source, destination);
	}
	public void deleteRoute(int routeId) {
		routeRepo.deleteById(routeId);
	}

}
