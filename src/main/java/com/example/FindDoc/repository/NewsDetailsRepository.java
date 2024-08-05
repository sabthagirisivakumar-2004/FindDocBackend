package com.example.FindDoc.repository;

import com.example.FindDoc.entity.NewsDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsDetailsRepository extends MongoRepository<NewsDetails, Integer> {

}