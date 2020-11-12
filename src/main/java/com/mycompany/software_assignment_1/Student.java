/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.software_assignment_1;

import java.util.ArrayList;

/**
 *
 * @author stephen murphy 17410394
 */
public class Student {
    
    private String name;
    private int age;
    private final int ID;
    private String DOB;
    ArrayList<Module> modules = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    
    public Student(String name, String DOB, int age, int ID) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
    }
    
    public String getUsername() {
        return name + age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getID() {
        return ID;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getDOB() {
        return DOB;
    }
    
    public void setDOB(String DOB) {
        this.DOB = DOB;
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
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public Course getCourse(int index) {
        return courses.get(index);
    }
    
    public int courseCount() {
        return courses.size();
    }
}
