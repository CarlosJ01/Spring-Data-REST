package com.alfacentauri.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alfacentauri.spring.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
