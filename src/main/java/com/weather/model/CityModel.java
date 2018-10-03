package com.weather.model;

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
}
