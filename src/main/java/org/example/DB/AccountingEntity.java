package org.example.DB;

import javax.persistence.*;

@Entity
@Table(name = "accounting", schema = "labsdb", catalog = "")
public class AccountingEntity {
    public AccountingEntity(String employeesSurname, String employeesName, String employeesLastname, double salaryPerDay, int workingDays) {
        this.employeesSurname = employeesSurname;
        this.employeesName = employeesName;
        this.employeesLastname = employeesLastname;
        this.salaryPerDay = salaryPerDay;
        this.workingDays = workingDays;
    }
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "employees_surname", nullable = false, length = 255)
    private String employeesSurname;
    @Basic
    @Column(name = "employees_name", nullable = false, length = 255)
    private String employeesName;
    @Basic
    @Column(name = "employees_lastname", nullable = false, length = 255)
    private String employeesLastname;
    @Basic
    @Column(name = "salary_per_day", nullable = false, precision = 0)
    private double salaryPerDay;
    @Basic
    @Column(name = "working_days", nullable = false)
    private int workingDays;

    public AccountingEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeesSurname() {
        return employeesSurname;
    }

    public void setEmployeesSurname(String employeesSurname) {
        this.employeesSurname = employeesSurname;
    }

    public String getEmployeesName() {
        return employeesName;
    }

    public void setEmployeesName(String employeesName) {
        this.employeesName = employeesName;
    }

    public String getEmployeesLastname() {
        return employeesLastname;
    }

    public void setEmployeesLastname(String employeesLastname) {
        this.employeesLastname = employeesLastname;
    }

    public double getSalaryPerDay() {
        return this.salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getWorkingDays() {
        return this.workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
}
