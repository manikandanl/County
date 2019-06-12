package com.country.model;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "countrys")
public class Country {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String countryname;
	private String captital;
	@OneToMany(cascade={CascadeType.ALL})
   @JoinColumn(name="country_id")
	@IndexColumn(name="idx")
	private Set<State> state;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCaptital() {
		return captital;
	}
	public void setCaptital(String captital) {
		this.captital = captital;
	}
	//public String getStatename() {
//		return statename;
//	}
//	public void setStatename(String statename) {
//	this.statename = statename;
//	}
	
	
	
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryname=" + countryname + ", captital=" + captital + ", state=" + state
				+ "]";
	}
	public Set<State> getState() {
		return state;
	}
	public void setState(Set<State> state) {
		this.state = state;
	}

}