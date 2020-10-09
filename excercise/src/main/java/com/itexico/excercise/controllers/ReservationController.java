package com.itexico.excercise.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReservationController {
	
		//Return list of reservations
		@RequestMapping(method = RequestMethod.GET, value = "/reservations")	
		public Object getSaleTransaction() {
			
			    ResponseEntity response = new ResponseEntity("ok", HttpStatus.OK);
			    
				return response;
			
		}

}
