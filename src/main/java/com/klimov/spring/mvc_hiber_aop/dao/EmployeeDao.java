package com.klimov.spring.mvc_hiber_aop.dao;

import com.klimov.spring.mvc_hiber_aop.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
