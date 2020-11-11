package com.example.clinicaldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clinicaldemo.service.ClinicalDemoService;
import com.example.clinicaldemo.vo.BillDataResponseVO;
import com.example.clinicaldemo.vo.OwnerDataVO;
import com.example.clinicaldemo.vo.RegisterPatientRequestVO;

@RestController
public class ClinicalDemoController {

	@Autowired
	private ClinicalDemoService clinicalDemoService;
	
	@RequestMapping()
	public String registerOwner(OwnerDataVO ownerData) {
		return clinicalDemoService.registerOwner(ownerData);
	}
	
	public String registerPatient(List<RegisterPatientRequestVO> requestVO) {
		return clinicalDemoService.registerPatient(requestVO);
	}
	
	public void addTreatmentDetailsByAdmin(String treatmentPerformedId) {
		//it will take the treatments done and update the status and also add new treatments if need
	}
	
	public BillDataResponseVO getBillData(String treatmentPerformedId) {
		return clinicalDemoService.getBillData(treatmentPerformedId);
	}
	
	public String payBill(String treatmentPerformedId) {
		return clinicalDemoService.payBill(treatmentPerformedId);
	}
	
	/*
	 * Scenario 1 :
	 * 1. registerOwner()
	 * 2. registerPatient()
	 * 3. addTreatmentDetailsByAdmin()
	 * 4. payBill()
	 * 5. getBillData()
	 * 
	 * */
	
	/*
	 * Scenario 2 :
	 * 1. registerOwner()
	 * 2. registerPatient()
	 * 3. addTreatmentDetailsByAdmin()
	 * 4. getBillData()
	 * 5. sendPostpaidOutstandingBill()// done by scheduler
	 * 6. payBill()
	 * 
	 * */
	
	/*
	 * Scenario 3 :
	 * 1. multiple call to registerOwner()
	 * 2. registerPatient()
	 * 3. addTreatmentDetailsByAdmin()
	 * 4. multiple call to getBillData()
	 * 5. multiple sendPostpaidOutstandingBill()// done by scheduler
	 * 6. multiple payBill()
	 * 
	 * */
}
