/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import entity.Student;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USE
 */
public class Feature2 {
    private Validate check;
    Scanner sc = new Scanner(System.in);
    
    public void updateMark(List<Student> list){
        System.out.println("Update Mark");
        System.out.println("Enter ID:");
        int ID = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            Student e = list.get(i);
            if (e.getId() == ID) {               
                System.out.println("Enter new mark: ");
                e.setMark(Double.parseDouble(sc.nextLine()));
                System.out.println("Update mark successfully");
                return;
            }
        }
        System.out.println("ID does not exist");
    }
    
    public void deleteMark(List<Student> list){
        System.out.println("Delete Mark");
        System.out.println("Enter ID:");
        int ID = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            Student e = list.get(i);
            if (e.getId() == ID) {               
                e.setMark(0);
                System.out.println("Mark has been setted to 0");
                return;
            }
        }
        System.out.println("ID does not exist");
    }
}
