package com.rashika.inventorymanagement.employee_management.repository;

import com.rashika.inventorymanagement.employee_management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //Get employee by name
    public Employee findByEmployeeName(String employeeName);

    //Get all employees by salary
    @Query("SELECT e FROM Employee e WHERE e.employeeSalary >= ?1")
    public List<Employee> fetchAllEmployeeByEmployeeSalary(double employeeSalary);

    //Get all employees whether permanent or not and based on salary
    @Query(value = "SELECT e FROM Employee e WHERE e.employeeIsPermanent = ?1 AND e.employeeSalary >= ?2", nativeQuery = true)
    public List<Employee> fetchAllEmployeesByIsPermanentAndSalary(boolean employeeIsPermanent, double employeeSalary);

    //Get employee with case-insensitive
    public Employee findByEmployeeNameIgnoreCase(String employeeName);

}
