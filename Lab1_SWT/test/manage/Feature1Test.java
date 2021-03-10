/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author USE
 */
public class Feature1Test {
    
    Feature1 f1 = new Feature1();
    
    List<Student> lstS = input();
  
    public static List<Student> input() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "HE140000", 7));
        list.add(new Student(2, "HE140001", 8));
        list.add(new Student(3, "HE140002", 9));
        list.add(new Student(4, "HE140003", 10));
        list.add(new Student(5, "HE140004", 5));
        list.add(new Student(6, "HE140005", 4));
        return list;
    }
    
    public Feature1Test() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of updateStudent method, of class Feature1.
     */
    @Test
    public void testUpdateStudent() {
        boolean rs = f1.updateStudentT(lstS,1,"HE140111", 1);
        boolean expected = true;
        assertEquals(expected, rs);
        boolean rs2 = f1.updateStudentT(lstS,5,"hehelmao", 9);
        boolean expected2 = true;
        assertEquals(expected, rs);
    }
    
    @Test
    public void testAddStudent() {
        int rs = f1.addStudentT(lstS,7,"HE140112", 1);
        int expected = lstS.size();
        assertEquals(expected, rs);
        int rs2 = f1.addStudentT(lstS,0,"@@", 4);
        int expected2 = lstS.size();
        assertEquals(expected2, rs2);
    }
    
    @Test
    public void testRemoveStudent() {
        int rs = f1.removeStudentT(lstS, 2);
        int expected = lstS.size();
        assertEquals(expected, rs);
        int rs2 = f1.removeStudentT(lstS, 8);
        int expected2 = lstS.size();
        assertEquals(expected, rs);
    }
    
    
    
}
