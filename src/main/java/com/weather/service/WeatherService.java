package com.weather.service;

import com.weather.model.CityModel;
import com.weather.model.UserCityModel;


public interface WeatherService {
    
	    //public UserLoginModel getUser(LoginModel loginModel);

		public UserCityModel getCity(CityModel cityModel);

		public UserCityModel createCity(UserCityModel userCityModel);

		public CityModel convertModel(UserCityModel userCityModel);



}
