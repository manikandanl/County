package com.country.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.country.dao.Statedao;
import com.country.model.State;
@Component
public class Stateservice {
	
	
	@Autowired
	Statedao dao;
 
	public State add(State add) {
		return dao.create(add);
		}
	public List<State> findAll(){
		return dao.getAll();
		}

}
