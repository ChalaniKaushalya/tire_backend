package com.example.tire_management.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")  // MongoDB collection name
public class User {

    @Id
    private String id;

    private String name;
    private String email;
    private String password;
    private String employeeId;
    private String role;

    // Constructors
    public User() {
    }

    public User(String name, String email, String password, String employeeId, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.employeeId = employeeId;
        this.role = role;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // toString for debugging
    @Override
    public String toString() {
        return "User{"
                + "id='" + id + '\''
                + ", name='" + name + '\''
                + ", email='" + email + '\''
                + ", employeeId='" + employeeId + '\''
                + ", role='" + role + '\''
                + '}';
    }
}
