package com.example.FindDoc.repository;

import com.example.FindDoc.entity.EventsDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepository extends MongoRepository<EventsDetails, Integer> {
}