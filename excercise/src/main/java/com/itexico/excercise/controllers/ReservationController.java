package com.itexico.excercise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itexico.excercise.entity.Reservation;
import com.itexico.excercise.repo.ReservationRepo;
import com.itexico.excercise.service.ReservationService;


@RestController
public class ReservationController {
	@Autowired
	ReservationService reservationService;
	
	//Return list of reservations
	@RequestMapping(method = RequestMethod.GET, value = "/reservations")	
	public Object getSaleTransaction() {
		ResponseEntity response;
		try {
			List<Reservation> res= reservationService.getAllReservations();
			response = new ResponseEntity(res, HttpStatus.OK);
		}catch(Exception e){
			response = new ResponseEntity("Sorry, there was an error in the system", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
			
	}

}
