package com.weather.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class City {
	
    @NotNull
    @Size(min=2, max=50)
    private String name;
    
    public String getName() {
    		return this.name;
    }
    
    public void setName(String name) {
    		this.name = name;
    }
    
    public String toString() {
    		return "Person(Name: "+this.name+")";
    }

}
