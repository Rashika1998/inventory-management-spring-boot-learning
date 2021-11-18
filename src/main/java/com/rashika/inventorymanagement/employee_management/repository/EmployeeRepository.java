package com.rashika.inventorymanagement.employee_management.repository;

import com.rashika.inventorymanagement.employee_management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee findByEmployeeName(String employeeName);

}
