package com.hibernate_test.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "capital")
public class Capital implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @Column(name = "name")
    private String name;

    
    @OneToOne(cascade=CascadeType.ALL)  
//    @JoinColumn(referencedColumnName = "countryid", name = "conid")
    private Country country;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}


	public Capital(Long id, String name, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}


	public Capital() {
		// TODO Auto-generated constructor stub
	}
 
    
}