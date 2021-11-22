package com.rashika.inventorymanagement.employee_management.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    private String employeeCode;

    @NotBlank(message = "Please add employee name.")
    /*
    @Length(max = 10, min = 5)
    @Size(max = 10, min = 0)
     */
    private String employeeName;

    private String employeeAge;
    private boolean employeeIsPermanent;
    private double employeeSalary;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    public boolean isEmployeeIsPermanent() {
        return employeeIsPermanent;
    }

    public void setEmployeeIsPermanent(boolean employeeIsPermanent) {
        this.employeeIsPermanent = employeeIsPermanent;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Employee(Long employeeId, String employeeCode, String employeeName, String employeeAge, boolean employeeIsPermanent, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeIsPermanent = employeeIsPermanent;
        this.employeeSalary = employeeSalary;
    }

    public Employee(String employeeCode, String employeeName, String employeeAge, boolean employeeIsPermanent, double employeeSalary) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeIsPermanent = employeeIsPermanent;
        this.employeeSalary = employeeSalary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeCode='" + employeeCode + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge='" + employeeAge + '\'' +
                ", employeeIsPermanent=" + employeeIsPermanent +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
