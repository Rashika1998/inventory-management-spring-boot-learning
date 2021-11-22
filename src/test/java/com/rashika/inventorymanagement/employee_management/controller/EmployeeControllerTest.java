package com.rashika.inventorymanagement.employee_management.controller;
import com.rashika.inventorymanagement.employee_management.entity.Employee;
import com.rashika.inventorymanagement.employee_management.error.EmployeeNotFoundException;
import com.rashika.inventorymanagement.employee_management.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    private Employee employee;



    @BeforeEach
    void setUp() {

        employee = new Employee(1L,"emp-001", "Rashika Rathnayaka", "23", true, 1150.50);

    }

    @Test
    void addEmployee() throws Exception {

        Employee inputEmployee = new Employee("emp-001", "Rashika Rathnayaka", "23", true, 1150.50);

        Mockito.when(employeeService.addEmployee(inputEmployee)).thenReturn(employee);

        mockMvc.perform(post("/employees").contentType(MediaType.APPLICATION_JSON).content("{\"employeeCode\": \"emp-001\",\n" +
                "        \"employeeName\": \"Rashika Rathnayaka\",\n" +
                "        \"employeeAge\": \"23\",\n" +
                "        \"employeeIsPermanent\": true,\n" +
                "        \"employeeSalary\": 1150.5}")).andExpect(status().isOk());

    }

    @Test
    @Disabled
    void getEmployee() throws Exception {
        Mockito.when(employeeService.getEmployee(1L)).thenReturn(employee);

        mockMvc.perform(get("/employees/1").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(jsonPath("$.employeeName").value(employee.getEmployeeName()));

    }
}