package com.example.clinicaldemo.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreatmentVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String treatmentId;
	private String treatmentName;
	private String treatmentCost;
}
