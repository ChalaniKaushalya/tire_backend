package com.example.tire_management.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.tire_management.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email); // (already added previously)

    Optional<User> findByEmailAndPassword(String email, String password); // ✅ ADD THIS

}
