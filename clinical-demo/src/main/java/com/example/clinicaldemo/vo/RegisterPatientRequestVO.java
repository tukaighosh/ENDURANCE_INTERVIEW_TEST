package com.example.clinicaldemo.vo;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterPatientRequestVO {
	
	 private String patientName;
	 private String patientType;
	 private List<String> treatmentNeeded;
	 private Map<String, Integer> ownerShareingData;
}
