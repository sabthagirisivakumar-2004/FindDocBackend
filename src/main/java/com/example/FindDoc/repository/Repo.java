package com.example.FindDoc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.FindDoc.entity.HospitalDetails;

@Repository
public interface Repo extends MongoRepository<HospitalDetails,String>{

}
