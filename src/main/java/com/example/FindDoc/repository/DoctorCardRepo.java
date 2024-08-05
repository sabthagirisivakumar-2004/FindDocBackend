package com.example.FindDoc.repository;

import com.example.FindDoc.entity.DoctorCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorCardRepo extends MongoRepository<DoctorCard,Integer> {
}
