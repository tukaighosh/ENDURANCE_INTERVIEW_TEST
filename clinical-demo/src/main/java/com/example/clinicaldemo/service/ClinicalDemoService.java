package com.example.clinicaldemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.clinicaldemo.vo.BillDataResponseVO;
import com.example.clinicaldemo.vo.OwnerDataVO;
import com.example.clinicaldemo.vo.RegisterPatientRequestVO;

@Service
public interface ClinicalDemoService {

	String registerOwner(OwnerDataVO ownerData);

	String registerPatient(List<RegisterPatientRequestVO> requestVO);

	BillDataResponseVO getBillData(String treatmentPerformedId);

	String payBill(String treatmentPerformedId);

}
