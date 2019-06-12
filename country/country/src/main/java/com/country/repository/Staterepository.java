package com.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.country.model.State;
@Repository
public interface Staterepository extends JpaRepository<State, Long>{

}
