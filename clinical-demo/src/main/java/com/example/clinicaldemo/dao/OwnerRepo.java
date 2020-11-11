package com.example.clinicaldemo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.clinicaldemo.domain.Owner;

@Repository
public interface OwnerRepo extends CrudRepository<Long, Owner>{

}
