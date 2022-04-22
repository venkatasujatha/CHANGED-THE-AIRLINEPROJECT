package com.user.service;

import java.util.Comparator;

import com.user.model.Passenger;

public class serviceComparator implements Comparator<Passenger> 
{
	public int compare(Passenger p1,Passenger p2)
	{
		Integer a=p1.getAge();
		Integer b=p2.getAge();
		return a.compareTo(b);
		
	}
}
