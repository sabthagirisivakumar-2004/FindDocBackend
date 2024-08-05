package com.example.FindDoc.repository;

import com.example.FindDoc.entity.HospitalCard;
import com.example.FindDoc.entity.HospitalDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalCardRepo extends MongoRepository<HospitalCard,Integer> {
}
