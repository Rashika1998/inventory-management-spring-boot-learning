package com.rashika.inventorymanagement.employee_management.service;
import com.rashika.inventorymanagement.employee_management.entity.Employee;
import com.rashika.inventorymanagement.employee_management.repository.EmployeeRepository;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {

        Employee employee = new Employee(3L,"emp-002", "Rashika", "23", true, 1050.50);
        Mockito.when(employeeRepository.findByEmployeeName("Rashika")).thenReturn(employee);

    }

    @Test
    @DisplayName("Get data based on valid employee name")
    @Disabled
    public void whenValidEmployeeName_thenEmployeeShouldFound(){

        String employeeName = "Rashika";
        Employee found = employeeService.fetchEmployeeByName(employeeName);
        assertEquals(employeeName, found.getEmployeeName());

    }
}