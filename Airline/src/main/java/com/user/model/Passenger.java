package com.user.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "passenger")
@Table(name = "passenger")

public class Passenger implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1784615537576598011L;
	@Id
	private Long id;
	private String name;
	private int age;
	private String gender;
	@Column(name = "t_id",insertable = false,updatable = false)
	private int tId;
	
	
	

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}
