package com.park.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/park")
public class ParkController {
	
		@PostMapping
		public ResponseEntity<Void> test(){
			return ResponseEntity.ok().build();
		}
		
		//create: crear un nuevo empleado 
		@PostMapping("/employee")
		public ResponseEntity<Void> createGame(Employee request){
			return ResponseEntity.ok().build();
		}

}
