package com.example.clinicaldemo.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Owner implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	@Column(unique = true)
	private String ownerId;
	private String ownerName;
	private String address;
	private String email;
	private String animalId;
	private int percentageOfBilling;
	@ManyToMany
	private List<Animal> animals;
}
