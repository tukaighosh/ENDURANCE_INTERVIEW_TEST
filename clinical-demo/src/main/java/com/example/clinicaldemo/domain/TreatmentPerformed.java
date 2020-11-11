package com.example.clinicaldemo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TreatmentPerformed implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String treatmentPerformedId;
	private String animalId;
	private String treatmentId;
	private Date treatmentDate;
	private String status;
	private String doctorName;
}
