package com.itexico.excercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itexico.excercise.entity.Reservation;
import com.itexico.excercise.repo.ReservationRepo;

@Service
public class ReservationService {
	
	@Autowired
	ReservationRepo repo;
	
	public List<Reservation> getAllReservations(){		
		return repo.findAll();		
	}

}
