package com.burak.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.burak.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
