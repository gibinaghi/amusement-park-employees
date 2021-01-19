package com.park.repository.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Park implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "gen_seq_park", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "seq_park", allocationSize = 1,
	      name = "gen_seq_park")
	private Integer id;
	
	private String name;
	private String lastname;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
