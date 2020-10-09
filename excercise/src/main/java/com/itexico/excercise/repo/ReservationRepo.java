package com.itexico.excercise.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itexico.excercise.entity.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Integer>{
	
	
}
