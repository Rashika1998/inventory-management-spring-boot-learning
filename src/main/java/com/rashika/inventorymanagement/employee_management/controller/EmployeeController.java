package com.rashika.inventorymanagement.employee_management.controller;

import com.rashika.inventorymanagement.employee_management.entity.Employee;
import com.rashika.inventorymanagement.employee_management.error.EmployeeNotFoundException;
import com.rashika.inventorymanagement.employee_management.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    private final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);


    @PostMapping("/employees")
    public Employee addEmployee(@Valid @RequestBody Employee employee){
        LOGGER.info("Inside addEmployee of EmployeeController.");
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable("id") Long employeeId) throws EmployeeNotFoundException {
        return employeeService.getEmployee(employeeId);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return "Employee has been deleted successfully.";
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable("id") Long employeeId, @RequestBody Employee employee){
        return employeeService.updateEmployee(employeeId, employee);
    }

    @GetMapping("/employees/name/{name}")
    public Employee fetchEmployeeByName(@PathVariable("name") String employeeName){
        return employeeService.fetchEmployeeByName(employeeName);
    }

    @GetMapping("/employees/salary/{salary}")
    public List<Employee> fetchAllEmployeeByEmployeeSalary(@PathVariable("salary") double employeeSalary){
        return employeeService.fetchAllEmployeeByEmployeeSalary(employeeSalary);
    }

    @GetMapping("/employees/is-permanent/salary/{is_permanent}/{salary}")
    public List<Employee> fetchAllEmployeesByIsPermanentAndSalary(@PathVariable("is_permanent") boolean employeeIsPermanent, @PathVariable("salary") double employeeSalary){
        return employeeService.fetchAllEmployeesByIsPermanentAndSalary(employeeIsPermanent, employeeSalary);
    }




}
