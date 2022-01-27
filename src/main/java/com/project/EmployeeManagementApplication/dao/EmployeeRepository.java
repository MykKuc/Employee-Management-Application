package com.project.EmployeeManagementApplication.dao;

import com.project.EmployeeManagementApplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //That is it. We get CRUD methods for free, no need to write anymore code.
}
