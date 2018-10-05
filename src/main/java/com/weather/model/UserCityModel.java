package com.weather.model;

public class UserCityModel {
	
	private String name;
	private Integer id;

	public Integer getId() {
		return id;
	}

	public UserCityModel() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){
		return ("City has name: "+this.name+" and id:"+this.id);
	}

}
