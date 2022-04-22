package com.user.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "tickets")
@Table(name = "tickets")
public class Ticket {
	@Id
	private Long id;
	private String classType;
	private String source;
	private String destination;
	private int cost;
	@Column(name = "boarding_date_and_time")
	private Date boardingDateAndTime;
	private Date depatureDateAndTime;
	private String timeOfJourney;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "t_id", referencedColumnName = "id", nullable = false)
	private List<Passenger> passengers;
	
	

	public Date getBoardingDateAndTime() {
		return boardingDateAndTime;
	}

	public void setBoardingDateAndTime(Date boardingDateAndTime) {
		this.boardingDateAndTime = boardingDateAndTime;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	
	public Date getDepatureDateAndTime() {
		return depatureDateAndTime;
	}

	public void setDepatureDateAndTime(Date depatureDateAndTime) {
		this.depatureDateAndTime = depatureDateAndTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getTimeOfJourney() {
		return timeOfJourney;
	}

	public void setTimeOfJourney(String timeOfJourney) {
		this.timeOfJourney = timeOfJourney;
	}

}
