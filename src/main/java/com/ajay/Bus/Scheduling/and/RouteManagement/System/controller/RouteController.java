package com.ajay.Bus.Scheduling.and.RouteManagement.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Route;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.service.RouteService;
@CrossOrigin(origins="http://127.0.0.1:5500")
@RestController
@RequestMapping("/route")
public class RouteController {
		@Autowired
	    RouteService routeService;
		@GetMapping("/search")
		public List<Route> searchBus(@RequestParam String source,
		                           @RequestParam String destination){

		    return routeService.findBySourceAndDestination(source, destination);
		}

}
