package Aggregation.Code_Example.Prof_and_University;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String professorId;
    private String name;
    private String department;
    private double salary;
    private List<String> courses;
    
    // Professor exists independently
    public Professor(String professorId, String name, String department, double salary) {
        this.professorId = professorId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.courses = new ArrayList<>();
    }
    
    public void teach(String course) {
        courses.add(course);
        System.out.println(name + " is teaching " + course);
    }
    
    public void research(String topic) {
        System.out.println(name + " is researching " + topic);
    }
    
    public String getProfessorId() { return professorId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    
    @Override
    public String toString() {
        return "Prof. " + name + " (" + department + ")";
    }
}