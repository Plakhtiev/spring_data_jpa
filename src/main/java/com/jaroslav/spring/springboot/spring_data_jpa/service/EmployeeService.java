package com.jaroslav.spring.springboot.spring_data_jpa.service;


import com.jaroslav.spring.springboot.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public void deleteEmployee(int id);
    public Employee getEmployee(int id);

    List<Employee> getEmployeeByName(String name);
}
