package com.example.FindDoc.repository;

import com.example.FindDoc.entity.SpecialityCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityCardRepo extends MongoRepository<SpecialityCard,Integer> {
}
