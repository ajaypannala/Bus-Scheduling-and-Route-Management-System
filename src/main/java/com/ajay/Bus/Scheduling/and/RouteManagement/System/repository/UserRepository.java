package com.ajay.Bus.Scheduling.and.RouteManagement.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.Bus.Scheduling.and.RouteManagement.System.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	public User findByEmail(String email);
	public User findByEmailAndPassword(String email,String password);
	public User findByRole(String role);

}
