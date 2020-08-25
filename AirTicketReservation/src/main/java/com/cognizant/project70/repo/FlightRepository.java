package com.cognizant.project70.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.project70.model.Flight;

public interface FlightRepository extends JpaRepository<Flight,Integer>{

}
