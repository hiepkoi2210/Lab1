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
public class Feature1 {

    private Validate check;
    Scanner sc = new Scanner(System.in);

    public List<Student> input() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "HE140000", 7));
        list.add(new Student(2, "HE140001", 8));
        list.add(new Student(3, "HE140002", 9));
        list.add(new Student(4, "HE140003", 10));
        list.add(new Student(5, "HE140004", 5));
        list.add(new Student(6, "HE140005", 4));
        return list;
    }
    
 
    public void display(List<Student> list) {
        for (Student e : list) {
            System.out.println(e);
        }
    }

    public void addStudent(List<Student> list) {
        int ID;     
        if (list.isEmpty()) {
            ID = 1;
        } else {
            ID = list.get(list.size() - 1).getId() + 1;
        }
        System.out.println("Add Student!!");
        System.out.println("Enter code: ");
        String code = sc.nextLine();
        System.out.println("Enter mark: ");
        double mark = Double.parseDouble(sc.nextLine());
        Student e = new Student(ID, code, mark);

        list.add(e);
        System.out.println("Add new student successfully");
    }     
    
    public int addStudentT(List<Student> list, int id, String code, double mark){  
        System.out.println("Add Student!!");
        if (list.isEmpty()) {
            id = 1;
        } else {
            id = list.get(list.size() - 1).getId() + 1;
        }
        String code1 = code;
        double mark1 = mark;
        Student e = new Student(id, code1, mark1);
        list.add(e);
        System.out.println("Add new student successfully");      
        return list.size();
    }
    
    public void removeStudent(List<Student> list) {
        System.out.println("Remove Student!!");
        System.out.println("Enter ID: ");
        int ID = Integer.parseInt(sc.nextLine());
        int size = list.size();

        for (int i = 0; i < size; i++) {
            Student e = list.get(i);
            if (e.getId() == ID) {
                list.remove(i);
                resetID(i, list);
                System.out.println("Remove successfully");
                return;
            }
        }
        System.out.println("ID does not exist");
    }
    
    public int removeStudentT(List<Student> list, int id) {
        System.out.println("Remove Student!!");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Student e = list.get(i);
            if (e.getId() == id) {
                list.remove(i);
                System.out.println("Remove successfully");  
                return list.size();
            }
        }
        return list.size();
    }

    public void resetID(int n, List<Student> list) {
        int size = list.size();
        for (int i = n; i < size; i++) {
            Student e = list.get(i);
            e.setId(i + 1);
        }
    }
    
    public void updateStudent(List<Student> list){
        System.out.println("Update Student");
        System.out.println("Enter ID:");
        int ID = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            Student e = list.get(i);
            if (e.getId() == ID) {
                System.out.println("Enter new code: ");
                e.setCode(sc.nextLine());               
                System.out.println("Update code successfully");
                System.out.println("Enter new mark: ");
                e.setMark(Double.parseDouble(sc.nextLine()));
                System.out.println("Update mark successfully");
                return;
            }
        }
        System.out.println("ID does not exist");
    }
    
    public boolean updateStudentT(List<Student> list, int id, String code, double mark){
        System.out.println("Update Student");
        for (int i = 0; i < list.size(); i++) {
            Student e = list.get(i);
            if (e.getId() == id) {
                e.setCode(code);               
                e.setMark(mark);
            }          
        }
        System.out.println("Update successfully");
        return true;
    }
}
