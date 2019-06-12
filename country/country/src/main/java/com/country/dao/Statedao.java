package com.country.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.country.model.State;
import com.country.repository.Staterepository;


@Component
public class Statedao {
	
		@Autowired
	Staterepository repository;
 
	public State create(State add) {
		return repository.save(add);
		}
	public List<State> getAll(){
		return repository.findAll();
		}
	
}
