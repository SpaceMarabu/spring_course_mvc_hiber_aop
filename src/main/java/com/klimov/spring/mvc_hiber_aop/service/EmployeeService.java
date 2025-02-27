package com.klimov.spring.mvc_hiber_aop.service;

import com.klimov.spring.mvc_hiber_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
