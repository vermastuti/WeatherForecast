package com.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.dao.CityDao;
import com.weather.entity.City;
import com.weather.model.CityModel;
import com.weather.model.UserCityModel;


@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private CityDao cityDao;
	
	@Override
	public UserCityModel getCity(CityModel cityModel){
	    UserCityModel model=new UserCityModel();
	    City city=cityDao.findCityByNameAndId(cityModel.getName(), cityModel.getId());
	    if (city !=null) {
			model.setName(city.getName());
			model.setId(city.getId());
	    }
	    return model;
	}
	
	@Override
	public UserCityModel createCity(CityModel cityModel){
	    City newCity=new City();
	    if (cityModel !=null) {
	    	newCity.setName(cityModel.getName());
	    }    
	    City savedCity = cityDao.save(newCity);
	    UserCityModel savedUserCityModel=new UserCityModel();
	    savedUserCityModel.setName(savedCity.getName());
	    savedUserCityModel.setId(savedCity.getId());	    
	    return savedUserCityModel;
	}

}