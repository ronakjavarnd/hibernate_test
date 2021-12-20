package com.hibernate_test.entities;


import java.io.Serializable;
import java.util.List;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;


@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "countryid")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade=CascadeType.ALL)  
    private Capital capital;

    @OneToOne
    @JoinColumn(name = "primary_language_id", referencedColumnName = "id")
    private Language language;

    @OneToMany(cascade = CascadeType.ALL)  
    @JoinColumn(name="qid")  
    @OrderColumn(name="type")  
    private List<Sport> sport;  
 
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

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	

	public List<Sport> getSport() {
		return sport;
	}

	public void setSport(List<Sport> sport) {
		this.sport = sport;
	}

	public Country(String name, Capital capital, Language language, List<Sport> sport) {
		super();
		this.id = (long) new Random().nextInt(1000);
		this.name = name;
		this.capital = capital;
		this.language = language;
		this.sport = sport;
	}

	public Country() {
		// TODO Auto-generated constructor stub
	}

//	public Country(String name, Capital capital, Language language, Sport sport) {
//		super();
//		
//		this.name = name;
//		this.capital = capital;
//		this.language = language;
//		this.sport = sport;
//	}
//     
	   
    
}