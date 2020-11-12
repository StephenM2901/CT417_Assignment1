/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.software_assignment_1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author stephen murphy 17410394
 */
public class ModuleTest {
    
    public ModuleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Module.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Module instance = new Module("Software Engineering III", "CT417");
        String expResult = "Software Engineering III";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Module.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Module instance = new Module("Software Engineering III", "CT417");
        instance.setName(name);
    }

    /**
     * Test of getID method, of class Module.
     */
    @org.junit.Test
    public void testGetID() {
        System.out.println("getID");
        Module instance = new Module("Software Engineering III", "CT417");
        String expResult = "CT417";
        String result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setID method, of class Module.
     */
    @org.junit.Test
    public void testSetID() {
        System.out.println("setID");
        String ID = "";
        Module instance = new Module("Software Engineering III", "CT417");
        instance.setID(ID);
    }

    /**
     * Test of addStudent method, of class Module.
     */
    @org.junit.Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = new Student("Tom Smith", "01/01/2000", 20, 17412345);
        Module instance = new Module("Software Engineering III", "CT417");
        instance.addStudent(student);
    }

    /**
     * Test of getStudent method, of class Module.
     */
    @org.junit.Test
    public void testGetStudent() {
        System.out.println("getStudent");
        int index = 0;
        Module instance = new Module("Software Engineering III", "CT417");
        Student student = new Student("Tom Smith", "01/01/2000", 20, 17412345);
        instance.addStudent(student);
        Student expResult = student;
        Student result = instance.getStudent(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of studentCount method, of class Module.
     */
    @org.junit.Test
    public void testStudentCount() {
        System.out.println("studentCount");
        Module instance = new Module("Software Engineering III", "CT417");
        int expResult = 0;
        int result = instance.studentCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCourse method, of class Module.
     */
    @org.junit.Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Course course = new Course("EG", "15/09/2020", "15/05/2021");
        Module instance = new Module("Software Engineering III", "CT417");
        instance.addCourse(course);
    }

    /**
     * Test of getCourse method, of class Module.
     */
    @org.junit.Test
    public void testGetCourse() {
        System.out.println("getCourse");
        int index = 0;
        Module instance = new Module("Software Engineering III", "CT417");
        Course course = new Course("EG", "15/09/2020", "15/05/2021");
        instance.addCourse(course);
        Course expResult = course;
        Course result = instance.getCourse(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of courseCount method, of class Module.
     */
    @org.junit.Test
    public void testCourseCount() {
        System.out.println("courseCount");
        Module instance = new Module("Software Engineering III", "CT417");
        int expResult = 0;
        int result = instance.courseCount();
        assertEquals(expResult, result);
    }
}
