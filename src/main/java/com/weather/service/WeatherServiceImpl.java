package com.weather.service;

import javax.xml.ws.WebServiceContext;

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

}