package com.codingjx.employeemanagementsystem.service.impl;

import com.codingjx.employeemanagementsystem.model.Employee;
import com.codingjx.employeemanagementsystem.repository.EmployeeRepository;
import com.codingjx.employeemanagementsystem.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
