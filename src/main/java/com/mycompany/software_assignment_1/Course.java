/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.software_assignment_1;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
/**
 *
 * @author stephen murphy 17410394
 */
public class Course {
    private String name;
    private final ArrayList<Module> modules = new ArrayList<>();
    private final ArrayList<Student> students = new ArrayList<>();
    private DateTime startDate;
    private DateTime endDate;
    private final DateTimeFormatter df = DateTimeFormat.forPattern("dd/MM/yyyy");
    
    public Course(String name, String startDateIn, String endDateIn) {
        this.name = name;
        long startMillis = df.parseMillis(startDateIn);
        long endMillis = df.parseMillis(endDateIn);
        startDate = new DateTime(startMillis);
        endDate = new DateTime(endMillis);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getStartDate() {
        return df.print(startDate);
    }
    
    public String getEndDate() {
        return df.print(endDate);
    }
    
    public void setStartDate(String startDateIn) {
        long startMillis = df.parseMillis(startDateIn);
        startDate = new DateTime(startMillis);
    }
    
    public void setEndDate(String endDateIn) {
        long endMillis = df.parseMillis(endDateIn);
        endDate = new DateTime(endMillis);
    }
    
    public void addModule(Module module) {
        modules.add(module);
    }
    
    public Module getModule(int index) {
        return modules.get(index);
    }
    
    public int moduleCount() {
        return modules.size();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public Student getStudent(int index) {
        return students.get(index);
    }
    
    public int studentCount() {
        return students.size();
    }
}


