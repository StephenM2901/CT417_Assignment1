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
public class Module {
    private String name;
    private String ID;
    
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    
    public Module(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
