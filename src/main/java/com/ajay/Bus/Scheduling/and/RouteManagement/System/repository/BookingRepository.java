package com.ajay.Bus.Scheduling.and.RouteManagement.System.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.Booking;
@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>{

    List<Booking> findByUserUserId(int userId);

    List<Booking> findByScheduleScheduleId(int scheduleId);

}

