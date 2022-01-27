package com.project.EmployeeManagementApplication.dao;

import com.project.EmployeeManagementApplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //JpaRepository interface provides main CRUD methods.
}
