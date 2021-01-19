package com.park.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.park.repository.ParkRepository;

@Service
public class ParkImpl implements Park{
	private ParkRepository repository; 
	
	
	@Autowired
	public ParkImpl(ParkRepository repository) {
		this.repository = repository;
	}


	@Override
	public void create() {
		repository.save(null);
	}

}
