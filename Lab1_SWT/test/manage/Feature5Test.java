/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PROLAP
 */
public class Feature5Test {

    Feature5 f5;

    public static List<Student> stuList() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "HE140000", 7));
        list.add(new Student(2, "HE140001", 8));
        list.add(new Student(3, "HE140002", 9));
        list.add(new Student(4, "HE140003", 10));
        list.add(new Student(5, "HE140004", 5));
        list.add(new Student(6, "HE140005", 4));
        list.add(new Student(7, "HE140006", 9));
        list.add(new Student(8, "HE140007", 7));
        list.add(new Student(9, "HE140008", 8));
        return list;
    }

    List<Student> list = stuList();

    public Feature5Test() {
        f5 = new Feature5();
    }

    @Test
    public void testGetMarkbyID() {
        int id = 5;
        double mark = f5.getMarkbyID(list, id);
        double exp = 7;
        assertEquals(exp, mark,0.0);
    }

    @Test
    public void testGetMarkType() {
        String type = f5.getMarkType(f5.getMarkbyID(list,5))+"";
        String expected = "A";
        assertEquals(expected, type);
    }

//    @Test
//    public void testCalPercent() {
//        
//    }

}
