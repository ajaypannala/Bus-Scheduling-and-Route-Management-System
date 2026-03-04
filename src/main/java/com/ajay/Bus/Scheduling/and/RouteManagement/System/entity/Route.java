package com.ajay.Bus.Scheduling.and.RouteManagement.System.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Route {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int routeId;
	private String source;
	private String destination;
	private String estimatedTime;
	private double distace;
	@OneToMany(mappedBy="route",cascade=CascadeType.ALL)
	private List<Schedule> schedules;
	
	public List<Schedule> getSchedules() {
		return schedules;
	}
	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}
	public Route(int routeId, String source, String destination, String estimatedTime, double distace,
			List<Schedule> schedules) {
		super();
		this.routeId = routeId;
		this.source = source;
		this.destination = destination;
		this.estimatedTime = estimatedTime;
		this.distace = distace;
		this.schedules = schedules;
	}
	public Route() {
		
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(String estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	public double getDistace() {
		return distace;
	}
	public void setDistace(double distace) {
		this.distace = distace;
	}
	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", source=" + source + ", destination=" + destination + ", estimatedTime="
				+ estimatedTime + ", distace=" + distace + ", schedules=" + schedules + "]";
	}
	
	

}
