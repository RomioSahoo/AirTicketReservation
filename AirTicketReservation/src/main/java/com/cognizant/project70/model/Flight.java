package com.cognizant.project70.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight1")
public class Flight {
	
	private int id;
	private String FlightNo;
	private String FlightName;
	private String FlightFrom;
	private String FlightTo;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightNo() {
		return FlightNo;
	}

	public void setFlightNo(String flightNo) {
		FlightNo = flightNo;
	}

	public String getFlightName() {
		return FlightName;
	}

	public void setFlightName(String flightName) {
		FlightName = flightName;
	}

	public String getFlightFrom() {
		return FlightFrom;
	}

	public void setFlightFrom(String flightFrom) {
		FlightFrom = flightFrom;
	}

	public String getFlightTo() {
		return FlightTo;
	}

	public void setFlightTo(String flightTo) {
		FlightTo = flightTo;
	}

}
