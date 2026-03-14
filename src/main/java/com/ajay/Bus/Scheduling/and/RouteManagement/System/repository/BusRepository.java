package com.ajay.Bus.Scheduling.and.RouteManagement.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Bus;
import java.util.*;
@Repository
public interface BusRepository extends JpaRepository<Bus,Integer> {
	public List<Bus> findByBusName(String busName);
	public List<Bus> findByBusType(String busType);

}
