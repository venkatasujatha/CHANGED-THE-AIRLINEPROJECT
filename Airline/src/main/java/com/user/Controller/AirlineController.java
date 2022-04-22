package com.user.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.IndicomAirlines;
import com.user.model.Passenger;
import com.user.model.Ticket;
import com.user.service.AirlineServiceInterface;

@RestController
public class AirlineController {

	@Autowired
	private AirlineServiceInterface airlineService;
	//1. Passengers should be able to book tickets – show the ticket cost once booking is done.
	
	@PostMapping("/bookticket")
	public IndicomAirlines bookTicket(@RequestBody IndicomAirlines indicomairlines) {
		return airlineService.saveTicket(indicomairlines);
	}
	//2. Get all the details of  INDI34E.
	
	@GetMapping("/getFlightPassangers/{flightName}")
	public List<IndicomAirlines> getFligt(@PathVariable("flightName") String flightName) {
		return airlineService.getFlightPassangers(flightName);

	}
	//3. Get all the details of INDI67G
	
	@GetMapping("/getFlight/{flightName}")
	public List<IndicomAirlines> getList(@PathVariable("flightName") String flightName) 
	{
		return airlineService.getList(flightName);
	  
	}
	@GetMapping("/getlist")
	public List<IndicomAirlines> getFList(IndicomAirlines airlines){
		return airlineService.fList(airlines);
	}
	//4. Get all passenger details of INDI67G sorted by name or age.
	
	@GetMapping("/sortbyage/{flightname}")
	public List<Passenger> skjdb(@PathVariable String flightname)
	{
		
		return airlineService.sortByAge(flightname);
	}
	
	/*@GetMapping("/serchbyticsortbyage")
	public List<Passenger> servhbyage()
	{
		return airlineService.servhByTicSortByAge();
	}*/
	
	
	
	//5. Get all passengers in a particular ticket (search with ticket id) sorted by age


	@GetMapping("/ticket/{id}")
	public List<Passenger> tick(@PathVariable int id)
	{
		return airlineService.tickets(id);
	}
	//6. cancel an entire journey – if ticket is cancelled within 1 hour of journey, no refund is given. If cancelled within 5 hours, 50% is refunded.


	@DeleteMapping("/cancelric/{id}")
	public String canceltic(@PathVariable int id)
	{
		return airlineService.canceltic(id);
		
	}
	//7. cancel partial ticket – no refund allowed.
	@DeleteMapping("/tickets/{tId}/{pId}")
	public String deletebyId(@PathVariable int tId,@PathVariable Long pId)
	{
		
		 return airlineService.deletebyId(tId,pId);
		
	}
	
	
	
	
	
	
	
}
