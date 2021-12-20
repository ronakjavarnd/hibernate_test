package com.hibernate_test.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sport")
public class Sport implements Serializable {
	
	@Id
    @GeneratedValue
    @Column(name = "sport_id")
    private Long id;

    @Column(name = "sport_name")
    private String sportname;
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSportname() {
		return sportname;
	}

	public void setSportname(String sportname) {
		this.sportname = sportname;
	}

	
	public Sport(Long id, String sportname, Country country) {
		super();
		this.id = id;
		this.sportname = sportname;
	}

	public Sport() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sport [id=" + id + ", sportname=" + sportname + "]";
	}
    
    


}
