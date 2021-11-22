package com.rashika.inventorymanagement.employee_management.repository;
import com.rashika.inventorymanagement.employee_management.entity.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {

        Employee employee = new Employee("emp-001", "Rashika Rathnayaka", "23", true, 1150.0);
        entityManager.persist(employee);

    }

    @Test
    @DisplayName("Employee find by id")
    @Disabled
    public void whenFindById_thenReturnEmployee(){
        Employee employee = employeeRepository.findById(1L).get();
        assertEquals(employee.getEmployeeCode(), "emp-001");
    }


}