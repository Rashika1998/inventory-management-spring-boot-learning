package com.rashika.inventorymanagement.employee_management.service;

import com.rashika.inventorymanagement.employee_management.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public Employee getEmployee(Long employeeId);

    public void deleteEmployee(Long employeeId);

    public Employee updateEmployee(Long employeeId, Employee employee);

    public Employee fetchEmployeeByName(String employeeName);

    public List<Employee> fetchAllEmployeeByEmployeeSalary(double employeeSalary);
}
