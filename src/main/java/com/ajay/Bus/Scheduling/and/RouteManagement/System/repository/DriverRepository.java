package com.ajay.Bus.Scheduling.and.RouteManagement.System.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Driver;
@Repository
public interface DriverRepository extends JpaRepository<Driver,Integer> {
	List<Driver> findByDriverName(String driverName);

}
