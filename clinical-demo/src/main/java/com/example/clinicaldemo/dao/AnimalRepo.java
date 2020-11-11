package com.example.clinicaldemo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.clinicaldemo.domain.Animal;

@Repository
public interface AnimalRepo extends CrudRepository<Long, Animal>{

}
