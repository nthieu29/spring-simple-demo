package com.nthieu.springsimpledemo.repository;

import com.nthieu.springsimpledemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        collectionResourceRel = "employees",
        path = "employees")
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
