package com.project.EmployeeManagementApplication.service;

import com.project.EmployeeManagementApplication.dao.EmployeeRepository;
import com.project.EmployeeManagementApplication.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    //Constructor injection below.
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository)
    {
        employeeRepository = theEmployeeRepository;
    }



    @Override
    public List<Employee> findAll()
    {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);

        Employee theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();

        }else {
            // Employee id was not found.
            throw new RuntimeException("Did not find employee - " + theId);

        }

        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }

}
