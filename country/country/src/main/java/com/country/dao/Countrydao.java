package com.country.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.country.model.Country;
import com.country.repository.Countryrepository;
@Component
public class Countrydao {

	@Autowired
	Countryrepository repository;
 
	public Country create(Country add) {
		return repository.save(add);
		}
	public List<Country> getAll(){
		return repository.findAll();
		}
}
