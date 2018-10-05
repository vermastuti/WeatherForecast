package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weather.entity.City;
import com.weather.model.CityModel;
import com.weather.model.UserCityModel;
import com.weather.service.WeatherService;

@Controller
public class WebController {
	
	@Autowired
	WeatherService weatherService;

    @GetMapping("/city")
    public String cityForm(Model model) {
        model.addAttribute("city", new City());
        System.out.println("get");
        //printValues();
        return "city";
    }

    @PostMapping("/city")
    public String citySubmit(@ModelAttribute City city) {
    	System.out.println("post");
         //printValues();
        return "result";
    }
    
    @GetMapping(value="/init", produces="text/plain")
    @ResponseBody
    public String printValues(){
    	CityModel cityModel = new CityModel();
      	cityModel.setName("delhi");
	
      	System.out.println(weatherService.getCity(cityModel).toString());
      	
      	return "success";
    }
    
    //Currently working on this
    @GetMapping(value="/create/city={cityName}", produces="text/plain")
    public String createCity(Model model){
    	UserCityModel userCityModel = new UserCityModel();
      	userCityModel.setName("delhi");
      	weatherService.createCity(userCityModel);
      	
      	return "success";
    }

}