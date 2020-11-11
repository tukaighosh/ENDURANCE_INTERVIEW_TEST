package com.example.clinicaldemo.domain;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TreatmentPerformedPayment {

	private String treatmentPerformedId;
	private String ownerId;
	private String animalId;
	private double amount;
	private boolean isPaid;
}
