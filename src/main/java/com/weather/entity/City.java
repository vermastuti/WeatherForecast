package com.weather.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class City {

    private String name;
    
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
