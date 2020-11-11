package com.example.clinicaldemo.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreatmentPerformedVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String animalId;
	private String treatmentId;
	private Date treatmentDate;
	private String doctorName;
}
