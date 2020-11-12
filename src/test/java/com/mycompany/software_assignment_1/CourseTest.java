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
public class CourseTest {
    
    public CourseTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Course.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        String expResult = "EG";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Course.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Test";
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        instance.setName(name);
    }

    /**
     * Test of addModule method, of class Course.
     */
    @org.junit.Test
    public void testAddModule() {
        System.out.println("addModule");
        Module module = new Module("Software Engineering III", "CT417");
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        instance.addModule(module);
    }

    /**
     * Test of getStartDate method, of class Course.
     */
    @org.junit.Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        String expResult = "15/09/2020";
        String result = instance.getStartDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEndDate method, of class Course.
     */
    @org.junit.Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        String expResult = "15/05/2021";
        String result = instance.getEndDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStartDate method, of class Course.
     */
    @org.junit.Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        String startDateIn = "01/01/2020";
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        instance.setStartDate(startDateIn);
    }

    /**
     * Test of setEndDate method, of class Course.
     */
    @org.junit.Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        String endDateIn = "31/12/2022";
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        instance.setEndDate(endDateIn);
    }

    /**
     * Test of getModule method, of class Course.
     */
    @org.junit.Test
    public void testGetModule() {
        System.out.println("getModule");
        int index = 0;
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        Module expResult = new Module("Software Engineering III", "CT417");
        instance.addModule(expResult);
        Module result = instance.getModule(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of moduleCount method, of class Course.
     */
    @org.junit.Test
    public void testModuleCount() {
        System.out.println("moduleCount");
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        int expResult = 0;
        int result = instance.moduleCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of addStudent method, of class Course.
     */
    @org.junit.Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = new Student("Tom Smith", "01/01/2000", 20, 17412345);
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        instance.addStudent(student);
    }

    /**
     * Test of getStudent method, of class Course.
     */
    @org.junit.Test
    public void testGetStudent() {
        System.out.println("getStudent");
        int index = 0;
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        Student student = new Student("Tom Smith", "01/01/2000", 20, 17412345);
        instance.addStudent(student);
        Student expResult = student;
        Student result = instance.getStudent(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of studentCount method, of class Course.
     */
    @org.junit.Test
    public void testStudentCount() {
        System.out.println("studentCount");
        Course instance = new Course("EG", "15/09/2020", "15/05/2021");
        int expResult = 0;
        int result = instance.studentCount();
        assertEquals(expResult, result);
    }
    
}
