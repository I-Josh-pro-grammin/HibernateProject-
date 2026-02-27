package org.sms.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
public class Employee extends Person {

    private double salary;
    private String qualification;


    public Employee(double salary, String qualification) {
        this.salary = salary;
        this.qualification = qualification;
    }

    public double getSalary() {
        return salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
