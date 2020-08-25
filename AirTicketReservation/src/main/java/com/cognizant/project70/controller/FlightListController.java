package com.cognizant.project70.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.project70.model.FlightList;
import com.cognizant.project70.service.FlightListService;

@Controller
public class FlightListController {
@Autowired	
FlightListService fls;

@RequestMapping("/search")
public String search(Model m) {
	System.out.println("Inside search method");
	m.addAttribute("command", new FlightList());
	return "searchFlight";
}

@RequestMapping("/searchId")
public String serachFlight(@RequestParam("name") String name,Model m) {
	System.out.println("Inside searchFlight method");
	Optional<FlightList> st=fls.getFlightDetails(name);
	if(st.isPresent())
	{
		List<FlightList> list=fls.listAll();
		m.addAttribute("list",list);
		return "searchFound";
	}
	else
		return "searchNotFound";

}
}
