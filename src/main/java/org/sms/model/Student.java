package org.sms.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student extends Person {

    private String schoolName;
    private String academicYear;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Laptop> laptop = new ArrayList<>();

    public Student() {
    }

    public Student(String schoolName, String academicYear, List<Laptop> laptop, PersonNames names) {
        this.schoolName = schoolName;
        this.academicYear = academicYear;
        this.laptop = laptop;
        this.setNames(names);
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                ", academicYear='" + academicYear + '\'' +
                '}';
    }
}
