package com.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.user.model.IndicomAirlines;
import com.user.response.ResponseEntity;

@Repository
public interface AirlinesRepository extends JpaRepository<IndicomAirlines, Long> {

	//@Query(name = "select f from airlines f where f.flightName=:flightName")
	//public List<IndicomAirlines> findByflightName(@Param("flightName") String flightName);
//	@Query(value = "SELECT new com.user.response.ResponseEntity(a.flight_name,a.class_type,t.ticket_id,p.name,p.age,p.gender,t.source,t.destination,t.arrival_date_and_time,t.depature_date_and_time,t.time_of_journey,t.cost) FROM tickets t  JOIN  airlines a ON a.flight_name='INDI34E' AND a.id=t.f_id  JOIN passenger p ON t.id=p.t_id")
//	public List<ResponseEntity> findByIndicomeAirlines(ResponseEntity responseEntity);

	public List<IndicomAirlines> findByFlightName(String flightname);
}
