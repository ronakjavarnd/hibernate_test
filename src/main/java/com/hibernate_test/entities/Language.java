package com.hibernate_test.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
public class Language implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @Column(name = "language")
    private String language;

    @OneToMany(cascade = CascadeType.ALL)  
    @JoinColumn(name="cid")  
    @OrderColumn(name="type")  
    private List<Country> country;  
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
    
	

	public List<Country> getCountry() {
		return country;
	}

	public void setCountry(List<Country> country) {
		this.country = country;
	}

	public Language(Long id, String language) {
		super();
		this.id = id;
		this.language = language;
	}

	public Language() {
		// TODO Auto-generated constructor stub
	}
 
    
}