package com.country.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "states")
public class State {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Statename;
	private String capital;
	
	
//	@ManyToOne 
//	  @JoinColumn (name="country_id")
//	  @ManyToOne(fetch = FetchType.LAZY)
  //  @JoinColumn(name = "country_id", nullable = false)
	 // private Country country;
	
	
	  @ManyToOne
		@JoinColumn(name="country_id", 
					insertable=false, updatable=false, 
				nullable=true)
	private Country country;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatename() {
		return Statename;
	}
	public void setStatename(String statename) {
		Statename = statename;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	//public String getCountryname() {
	//	return countryname;
	//}
	//public void setCountryname(String countryname) {
	//	this.countryname = countryname;
	//}
	 
	@Override
	public String toString() {
		return "State [id=" + id + ", Statename=" + Statename + ", capital=" + capital 
				+ "]";
	}
	
	

}
