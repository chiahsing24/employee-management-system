package com.codingjx.employeemanagementsystem.service;

import com.codingjx.employeemanagementsystem.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
