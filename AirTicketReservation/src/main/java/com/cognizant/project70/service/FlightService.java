package com.cognizant.project70.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.project70.model.Flight;
import com.cognizant.project70.repo.FlightRepository;
@Service
@Transactional
public class FlightService {
	@Autowired
	FlightRepository repo;

	public void bookFlight(Flight f) {
		repo.save(f);
	}
	
	public List<Flight> listAll(){
		return repo.findAll();
	}
	
	public void deleteTicket(int id) {
		repo.deleteById(id);
	}
	
	public Optional<Flight> getFlightId(int id) {
		return repo.findById(id);
	}
}
