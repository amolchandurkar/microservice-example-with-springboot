package com.aac.docker.example.microservice.employee;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends
MongoRepository<Employee, String> {
 
}
