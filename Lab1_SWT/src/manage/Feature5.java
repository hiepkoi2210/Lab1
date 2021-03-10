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
public class Feature5 {

    public static List<Student> list = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public double getMarkbyID(List<Student>list, int id) {
        while (true) {
            try {
                for (Student s : list) {
                    if (s.getId() == id) {
                        return s.getMark();
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter again: ");
            }
        }
    }

    public String getMarkType(double mark) {
        String type = "";
        if (mark > 7.5) {
            type = "A";
        } else if (mark>= 6 && mark <= 7.5) {
            type = "B";
        } else if (mark >= 4 && mark < 6) {
            type = "C";
        } else if (mark < 4) {
            type = "D";
        }
        return type;
    }

    public void calPercent(List<Student> list) {
        System.out.println("Percentage grading:");

        double countA = 0, countB = 0, countC = 0, countD = 0;

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getMark() > 7.5) {
                countA++;
            } else if (s.getMark() >= 6 && s.getMark() <= 7.5) {
                countB++;
            } else if (s.getMark() >= 4 && s.getMark() < 6) {
                countC++;
            } else if (s.getMark() < 4) {
                countD++;
            }
        }
        double A = ((countA / list.size()) * 100);
        double B = ((countB / list.size()) * 100);
        double C = ((countC / list.size()) * 100);
        double D = ((countD / list.size()) * 100);

        System.out.println("A: " + Math.round(A * 100.0) / 100.0 + "%");
        System.out.println("B: " + Math.round(B * 100.0) / 100.0 + "%");
        System.out.println("C: " + Math.round(C * 100.0) / 100.0 + "%");
        System.out.println("D: " + Math.round(D * 100.0) / 100.0 + "%");
        System.out.println("");
    }

    public static void main(String[] args) {
        Feature5 f5 = new Feature5();
        list.add(new Student(1, "HE140000", 7));
        list.add(new Student(2, "HE140001", 8));
        list.add(new Student(3, "HE140002", 9));
        list.add(new Student(4, "HE140003", 10));
        list.add(new Student(5, "HE140004", 5));
        list.add(new Student(6, "HE140005", 4));
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(in.nextLine().trim());
        System.out.println("Sinh vien co id "+id+" co diem "+f5.getMarkbyID(list,id)+" "
                + " xep loai "+f5.getMarkType(f5.getMarkbyID(list, id)));

    }
}
