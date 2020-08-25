package com.cognizant.project70.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.project70.model.FlightList;

public interface FlightListRepository extends JpaRepository<FlightList,String> {

}
