/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USE
 */
public class Feature2 {

    private Validate check;
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> students;

//    public void updateMark(List<Student> list){
//        System.out.println("Update Mark - Enter ID: ");
//
//        int ID = Integer.parseInt(sc.nextLine());
//        for (Student e : list) {
//            
//            
//            if (e.getId() == ID) {               
//                System.out.println("Enter new mark: ");
//                e.setMark(Double.parseDouble(sc.nextLine()));
//                System.out.println("Update mark successfully");
//                return;
//            }
//        }
//        System.out.println("ID does not exist");
//    }
    public boolean updateMark(int id, double mark) {
        System.out.println("Update Mark - Enter ID: " + id);
        for (Student e : students) {
            if (e.getId() == id) {
                System.out.println("Enter new mark: " + mark);
                e.setMark(mark);
                return true;
            }
        }
        return false;
    }

    public  Student deleteMark(int id) {
        System.out.println("Delete Mark - Enter ID: " + id);

        for (Student e : students) {

            if (e.getId() == id) {
                e.setMark(0);
                System.out.println("Mark has been setted to 0");
                return e;
            }
        }
        System.out.println("ID does not exist");
        return null;
    }
}
