package com.example.tire_management.controller;

import com.example.tire_management.model.User;
import com.example.tire_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:3001")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public User login(@RequestBody User loginRequest) {
        Optional<User> user = userRepository.findByEmailAndPassword(
                loginRequest.getEmail(), loginRequest.getPassword());
        return user.orElse(null);
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
        Optional<User> user = userRepository.findByEmail(email);
        return user.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
