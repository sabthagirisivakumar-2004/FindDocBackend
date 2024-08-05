package com.example.FindDoc.repository;

import com.example.FindDoc.entity.DoctorDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorDetailRepo extends MongoRepository<DoctorDetails,Integer> {

}
