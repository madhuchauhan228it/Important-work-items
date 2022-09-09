package com.sunglowys.domain;

import java.util.Objects;

public class Employee {
    private int empId;
    private String empName;
    public String empMobile;
    public String empEmailId;
    public String empGender;

    public Employee() {
    }

    public Employee( String empName, String empMobile, String empEmailId, String empGender) {

        this.empName = empName;
        this.empMobile = empMobile;
        this.empEmailId = empEmailId;
        this.empGender = empGender;

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile;
    }

    public String getEmpEmailId() {
        return empEmailId;
    }

    public void setEmpEmailId(String empEmailId) {
        this.empEmailId = empEmailId;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(empName, employee.empName) && Objects.equals(empMobile, employee.empMobile) && Objects.equals(empEmailId, employee.empEmailId) && Objects.equals(empGender, employee.empGender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empMobile, empEmailId, empGender);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empMobile='" + empMobile + '\'' +
                ", empEmailId='" + empEmailId + '\'' +
                ", empGender='" + empGender + '\'' +
                '}';
    }
}





