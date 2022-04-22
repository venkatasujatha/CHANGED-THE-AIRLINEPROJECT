package com.user.response;

import java.util.Date;

public class ResponseEntity {
	private String flightName;
	private String classType;
	private String ticketId;
	private String name;
	private int age;
	private String gender;
	private String source;
	private String destination;
	private Date arrivalDate;
	private Date depatureDate;
	private String timeOfJourney;
	private int cost;
	

	public ResponseEntity(String classType, String ticketId, String name, int age, String gender, String source,
			String destination, Date arrivalDate, Date depatureDate, String timeOfJourney, int cost) {
		super();
		this.classType = classType;
		this.ticketId = ticketId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.source = source;
		this.destination = destination;
		this.arrivalDate = arrivalDate;
		this.depatureDate = depatureDate;
		this.timeOfJourney = timeOfJourney;
		this.cost = cost;
	}

	public ResponseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseEntity(String flightName, String classType, String ticketId, String name, int age, String gender,
			String source, String destination, Date arrivalDate, Date depatureDate, String timeOfJourney, int cost) {
		super();
		this.flightName = flightName;
		this.classType = classType;
		this.ticketId = ticketId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.source = source;
		this.destination = destination;
		this.arrivalDate = arrivalDate;
		this.depatureDate = depatureDate;
		this.timeOfJourney = timeOfJourney;
		this.cost = cost;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getDepatureDate() {
		return depatureDate;
	}

	public void setDepatureDate(Date depatureDate) {
		this.depatureDate = depatureDate;
	}

	public String getTimeOfJourney() {
		return timeOfJourney;
	}

	public void setTimeOfJourney(String timeOfJourney) {
		this.timeOfJourney = timeOfJourney;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
