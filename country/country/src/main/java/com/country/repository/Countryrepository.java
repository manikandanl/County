package com.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.country.model.Country;
@Repository
public interface Countryrepository extends JpaRepository<Country, Long>{

}
