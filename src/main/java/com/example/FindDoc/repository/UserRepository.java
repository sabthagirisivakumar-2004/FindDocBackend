package com.example.FindDoc.repository;

import com.example.FindDoc.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {

    User findByEmail(String username);
}