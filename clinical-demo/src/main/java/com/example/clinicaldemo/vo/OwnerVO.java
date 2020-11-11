package com.example.clinicaldemo.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OwnerVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ownerId;
	private String ownerName;
	private String address;
	private String email;
	private String animalId;
	private int percentageOfBilling;
}
