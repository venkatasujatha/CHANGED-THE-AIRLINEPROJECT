package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;

import com.user.model.IndicomAirlines;
import com.user.model.Passenger;
import com.user.model.Ticket;

public interface AirlineServiceInterface {
	public IndicomAirlines saveTicket(IndicomAirlines ticket);
	
	public List<IndicomAirlines> getFlightPassangers(String flightName);
	
	public List<IndicomAirlines> getList(String flightName);
	
	
	
	public List<IndicomAirlines> fList(IndicomAirlines indicomAirlines);

	public List<Passenger> sortByAge(String flightname);

	public List<Passenger> servhByTicSortByAge();

	public List<Passenger> tickets(int id);

	//String deletebyId(Long id);

	public String canceltic(int id);

	String deletebyId(int tId,Long pId);

	

	

	
}
