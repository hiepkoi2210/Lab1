/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author long
 */
public class Feature2Test {

    Feature2 feature2;

    public Feature2Test() {
        feature2 = new Feature2();
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "1", 5));
        students.add(new Student(2, "2", 6));
        students.add(new Student(3, "3", 7));
        feature2.students = students;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of updateMark method, of class Feature2.
     */
    @Test
    public void testUpdateMark() {
        assertTrue(feature2.updateMark(1, 6));
        assertEquals(feature2.students.get(0), new Student(1, "1", 6));
        assertTrue(feature2.updateMark(2, 7));
        assertEquals(feature2.students.get(1), new Student(2, "2", 7));
        assertTrue(feature2.updateMark(3, 8));
        assertEquals(feature2.students.get(2), new Student(3, "3", 8));

        assertFalse(feature2.updateMark(4, 8));
        assertFalse(feature2.updateMark(5, 8));
        assertFalse(feature2.updateMark(6, 8)); 
    }

    /**
     * Test of deleteMark method, of class Feature2.
     */
    @Test
    public void testDeleteMark() {
        Student student1 = new Student(1, "1", 0);
        Student student2 = new Student(2, "2", 0);
        feature2.deleteMark(1);
        assertEquals(feature2.students.get(0), student1);
        feature2.deleteMark(2);
        assertEquals(feature2.students.get(0), student2);
        assertNull(feature2.deleteMark(5));
        assertEquals(feature2.students.get(0), student2);
       

    }
}
