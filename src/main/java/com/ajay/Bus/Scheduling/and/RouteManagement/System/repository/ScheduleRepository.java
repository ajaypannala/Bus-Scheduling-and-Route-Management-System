package com.ajay.Bus.Scheduling.and.RouteManagement.System.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Route;
import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Schedule;
@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Integer> {
	List<Schedule> findByRouteRouteId(int routeId);
	List<Schedule> findByBusBusId(int busId);
	List<Schedule> findByTravelDate(LocalDate travelDate);
	List<Schedule> findByRouteSourceAndRouteDestinationAndTravelDate(
	        String source,
	        String destination,
	        LocalDate travelDate
	);
}
