package com.weather.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
    private String name;
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
    		return this.name;
    }
    
    public void setName(String name) {
    		this.name = name;
    }
    
    public String toString() {
    		return "City(Name: "+this.name+")";
    }

}
