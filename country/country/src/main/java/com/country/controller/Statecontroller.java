package com.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.country.model.State;
import com.country.service.Stateservice;

@RestController
@RequestMapping("state")
public class Statecontroller {
	@Autowired
	Stateservice service;
	 @PostMapping("add")
	public State create(@RequestBody State add) {
		return service.add(add);
		}
	 @GetMapping("view")
	public List<State> getAll(){
		return service.findAll();
		}
	 
	 
	 
}
