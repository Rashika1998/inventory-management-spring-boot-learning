package com.rashika.inventorymanagement.employee_management.service;

import com.rashika.inventorymanagement.employee_management.entity.Employee;
import com.rashika.inventorymanagement.employee_management.error.EmployeeNotFoundException;
import com.rashika.inventorymanagement.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long employeeId) throws EmployeeNotFoundException {
        Optional<Employee> employee = employeeRepository.findById(employeeId);

        if (!employee.isPresent()){
            throw new EmployeeNotFoundException("Employee not available!");
        }
        return employee.get();

    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public Employee updateEmployee(Long employeeId, Employee employee) {
        Employee employeeDB = employeeRepository.findById(employeeId).get();

        if (Objects.nonNull(employee.getEmployeeCode()) && !"".equalsIgnoreCase(employee.getEmployeeCode())){
            employeeDB.setEmployeeCode(employee.getEmployeeCode());
        }

        if (Objects.nonNull(employee.getEmployeeName()) && !"".equalsIgnoreCase(employee.getEmployeeName())){
            employeeDB.setEmployeeName(employee.getEmployeeName());
        }

        if (Objects.nonNull(employee.getEmployeeAge()) && !"".equalsIgnoreCase(employee.getEmployeeAge())){
            employeeDB.setEmployeeAge(employee.getEmployeeAge());
        }

        if (Objects.nonNull(employee.isEmployeeIsPermanent())){
            employeeDB.setEmployeeIsPermanent(employee.isEmployeeIsPermanent());
        }

        if (Objects.nonNull(employee.getEmployeeSalary())){
            employeeDB.setEmployeeSalary(employee.getEmployeeSalary());
        }
        return employeeRepository.save(employeeDB);
    }

    @Override
    public Employee fetchEmployeeByName(String employeeName) {
        return employeeRepository.findByEmployeeName(employeeName);
    }

    @Override
    public List<Employee> fetchAllEmployeeByEmployeeSalary(double employeeSalary) {
        return employeeRepository.fetchAllEmployeeByEmployeeSalary(employeeSalary);
    }

    @Override
    public List<Employee> fetchAllEmployeesByIsPermanentAndSalary(boolean employeeIsPermanent, double employeeSalary) {
        return employeeRepository.fetchAllEmployeesByIsPermanentAndSalary(employeeIsPermanent, employeeSalary);
    }


}
