package com.rashika.inventorymanagement.employee_management.service;

import com.rashika.inventorymanagement.employee_management.entity.Employee;
import com.rashika.inventorymanagement.employee_management.error.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public Employee getEmployee(Long employeeId) throws EmployeeNotFoundException;

    public void deleteEmployee(Long employeeId);

    public Employee updateEmployee(Long employeeId, Employee employee);

    public Employee fetchEmployeeByName(String employeeName);

    public List<Employee> fetchAllEmployeeByEmployeeSalary(double employeeSalary);

    public List<Employee> fetchAllEmployeesByIsPermanentAndSalary(boolean employeeIsPermanent, double employeeSalary);
}
