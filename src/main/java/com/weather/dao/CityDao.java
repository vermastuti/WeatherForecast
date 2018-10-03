package com.weather.dao;

import org.springframework.data.repository.CrudRepository;

import com.weather.entity.City;

public interface CityDao extends CrudRepository<City, Long> {

   //City findUserLoginByUserNameAndPassword(String username,String id);

   City findCityByNameAndId(String name, Integer id);
}
