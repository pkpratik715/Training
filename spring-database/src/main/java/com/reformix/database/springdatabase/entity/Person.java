package com.reformix.database.springdatabase.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String location;
	
	private Date birthDate;
	
	public Person() {
	}
	public Person(int id, String name, String location, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = date;
	}
	public Person( String name, String location, Date date) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDate() {
		return birthDate;
	}
	public void setDate(Date date) {
		this.birthDate = date;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}
	
	
	

}
