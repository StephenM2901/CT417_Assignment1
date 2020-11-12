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
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @org.junit.Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        String expResult = "Stephen21";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getName method, of class Student.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        String expResult = "Stephen";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAge method, of class Student.
     */
    @org.junit.Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        int expResult = 21;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getID method, of class Student.
     */
    @org.junit.Test
    public void testGetID() {
        System.out.println("getID");
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        int expResult = 17410394;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Student.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Tom";
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        instance.setName(name);
    }

    /**
     * Test of setAge method, of class Student.
     */
    @org.junit.Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 19;
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        instance.setAge(age);
    }

    /**
     * Test of getDOB method, of class Student.
     */
    @org.junit.Test
    public void testGetDOB() {
        System.out.println("getDOB");
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        String expResult = "29/01/1999";
        String result = instance.getDOB();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDOB method, of class Student.
     */
    @org.junit.Test
    public void testSetDOB() {
        System.out.println("setDOB");
        String DOB = "04/02/1998";
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        instance.setDOB(DOB);
    } 

    /**
     * Test of addModule method, of class Student.
     */
    @org.junit.Test
    public void testAddModule() {
        System.out.println("addModule");
        Module module = new Module("Software Engineering III", "CT417");
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        instance.addModule(module);
    }

    /**
     * Test of getModule method, of class Student.
     */
    @org.junit.Test
    public void testGetModule() {
        System.out.println("getModule");
        int index = 0;
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        Module module = new Module("Software Engineering III", "CT417");
        instance.addModule(module);
        Module expResult = module;
        Module result = instance.getModule(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of moduleCount method, of class Student.
     */
    @org.junit.Test
    public void testModuleCount() {
        System.out.println("moduleCount");
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        int expResult = 0;
        int result = instance.moduleCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCourse method, of class Student.
     */
    @org.junit.Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Course course = new Course("EG", "15/09/2020", "15/05/2021");
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        instance.addCourse(course);
    }

    /**
     * Test of getCourse method, of class Student.
     */
    @org.junit.Test
    public void testGetCourse() {
        System.out.println("getCourse");
        int index = 0;
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        Course course = new Course("EG", "15/09/2020", "15/05/2021");
        instance.addCourse(course);
        Course expResult = course;
        Course result = instance.getCourse(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of courseCount method, of class Student.
     */
    @org.junit.Test
    public void testCourseCount() {
        System.out.println("courseCount");
        Student instance = new Student("Stephen", "29/01/1999", 21, 17410394);
        int expResult = 0;
        int result = instance.courseCount();
        assertEquals(expResult, result);
    }
}
