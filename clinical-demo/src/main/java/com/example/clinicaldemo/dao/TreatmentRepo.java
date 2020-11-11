package com.example.clinicaldemo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.clinicaldemo.domain.Treatment;

@Repository
public interface TreatmentRepo extends CrudRepository<Long, Treatment>{

}
