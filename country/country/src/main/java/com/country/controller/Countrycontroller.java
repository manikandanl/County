package com.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.country.model.Country;
import com.country.service.Countryservice;

@RestController
@RequestMapping("country")
public class Countrycontroller {
	@Autowired
	Countryservice service;
	 @PostMapping("addid")
	public Country create(@RequestBody Country add) {
		return service.create(add);
		}
	 @GetMapping("viewcountry")
	public List<Country> getAll(){
		return service.getAll();
		}
	 
  
}
