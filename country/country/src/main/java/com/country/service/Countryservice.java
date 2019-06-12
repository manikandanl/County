package com.country.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.country.dao.Countrydao;
import com.country.model.Country;
@Component
public class Countryservice {
	
	@Autowired
	Countrydao dao;
 
	public Country create(Country add) {
		return dao.create(add);
		}
	public List<Country> getAll(){
		return dao.getAll();
		}
	

}
