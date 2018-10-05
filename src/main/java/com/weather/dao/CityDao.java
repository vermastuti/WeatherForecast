package com.weather.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weather.entity.City;


public interface CityDao extends CrudRepository<City, Long> {

   //City findUserLoginByUserNameAndPassword(String username,String id);

   public City findCityByNameAndId(String name, Integer id);
   
   public <S extends City> S save(S name);
}
