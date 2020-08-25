package com.cognizant.project70.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.project70.model.Flight;
import com.cognizant.project70.service.FlightService;

@Controller
public class FlightController {
	@Autowired
	FlightService fs;

	@RequestMapping("/")
	public String show() {
		System.out.println("Inside show method");
		return "index";
	}

	@RequestMapping("/book")
	public String bookFlight(Model m) {
		System.out.println("Inside bookFlight method");
		m.addAttribute("command", new Flight());
		return "bookTicket";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("f") Flight f) {
		System.out.println("Inside save method");
		fs.bookFlight(f);
		return "flightBooked";

	}

	@RequestMapping("cancel")
	public String listTicket(Model m) {
		System.out.println("Inside listTicket method");
		List<Flight> list = fs.listAll();
		m.addAttribute("list", list);
		return "cancelTicket";
	}

	@RequestMapping(value = "delete/{id}")
	public String delete(@PathVariable int id) {
		System.out.println("Inside delete method");
		fs.deleteTicket(id);
		return "ticketCancelled";
	}


}
