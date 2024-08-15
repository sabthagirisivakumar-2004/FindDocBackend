package com.example.FindDoc.repository;

import com.example.FindDoc.entity.SpecialityDoctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityDoctorRepo extends MongoRepository<SpecialityDoctor,Integer> {
}
