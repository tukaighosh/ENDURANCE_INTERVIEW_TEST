package com.example.clinicaldemo.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimalVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String animalId;
	private String animalName;
	private String animalType;
}
