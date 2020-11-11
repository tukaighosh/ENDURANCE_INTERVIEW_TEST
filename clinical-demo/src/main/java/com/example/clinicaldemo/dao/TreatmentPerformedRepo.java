package com.example.clinicaldemo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.clinicaldemo.domain.TreatmentPerformed;

@Repository
public interface TreatmentPerformedRepo extends CrudRepository<Long, TreatmentPerformed>{

}
