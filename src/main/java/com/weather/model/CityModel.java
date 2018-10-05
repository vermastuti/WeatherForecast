package com.weather.model;

import org.springframework.core.style.ToStringCreator;

public class CityModel {
	
	private String name;	
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CityModel() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return ("City has name: "+this.name+" and id:"+this.id);
		
		
	}
}
