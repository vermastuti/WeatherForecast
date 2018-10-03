package com.weather.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;

import com.weather.model.CityModel;
import com.weather.service.WeatherService;
import com.weather.entity.City;

@ComponentScan(basePackages = {"com.weather"}, excludeFilters = @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class))
@EntityScan(basePackageClasses = City.class)
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
    	ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        WeatherService weatherService = 
      		  ctx.getBean("weatherService", WeatherService.class);
        CityModel cityModel = new CityModel();
      	cityModel.setName("delhi");
	
      	System.out.println(weatherService.getCity(cityModel).toString());
    }

}
