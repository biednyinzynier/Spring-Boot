package com.burak.springboot.cruddemo.service;

import java.util.List;

import com.burak.springboot.cruddemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	public Employee findById(int theId);
	public void save(Employee thEmployee);
	public void deleteById(int theId);
}
