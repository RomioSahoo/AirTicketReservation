package com.cognizant.project70.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.project70.model.FlightList;
import com.cognizant.project70.repo.FlightListRepository;

@Service
@Transactional
public class FlightListService {
	@Autowired
	FlightListRepository repo;
	
	public List<FlightList> listAll(){
		return repo.findAll();
	}
	
	public Optional<FlightList> getFlightDetails(String name){
		return repo.findById(name);
	}
}
