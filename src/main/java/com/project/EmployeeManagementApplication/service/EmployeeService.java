package com.project.EmployeeManagementApplication.service;

import com.project.EmployeeManagementApplication.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById (int theId);

    void save(Employee theEmployee);

    void deleteById (int theId);
}
