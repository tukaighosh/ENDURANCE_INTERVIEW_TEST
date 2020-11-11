package com.example.clinicaldemo.vo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillDataResponseVO {

	private String ownerId;
	private String email;
	private String ownerName;
	private double yourContribution;
	private List<BillDetail> billDetails;
	
	@Getter
	@Setter
	public static class BillDetail{
		private String animalId;
		private String treatmentDone;
		private double totalCost;
		private String doctorName;
	}
}
