/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Student;
import entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import manage.Feature1;
import manage.Feature2;
import manage.Feature4;
import manage.Feature5;
import manage.Feature6;

/**
 *
 * @author USE
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void menuAdmin() {
        System.out.println("1. View List, add, update, delete Student");
        System.out.println("2. Add, update, delete, the marks of a specific student");
        System.out.println("3. Query student information, including the marks, group by classes");
        System.out.println("4. View list, add, update, delete user; change user’s password");
        System.out.println("5. Query & print out the percentages of student grading-types (ABCD)");
        System.out.println("6. Login, Logout, change user’s password");
    }

    public static void menuWorker() {
        System.out.println("1. Query student information, including the marks, group by classes");
        System.out.println("2. Login, Logout, change user’s password");
    }

    public static List<User> UserAcc() {
        List<User> list = new ArrayList<>();
        list.add(new User("User1", "Hiep", "123", 1));
        list.add(new User("User2", "Thanh", "123", 1));
        list.add(new User("User3", "Long", "123", 1));
        return list;
    }

    public static List<User> AdminAcc() {
        List<User> list = new ArrayList<>();
        list.add(new User("Admin1", "Hiep", "000", 0));
        list.add(new User("Admin2", "Thanh", "000", 0));
        list.add(new User("Admin3", "Long", "000", 0));
        return list;
    }

    public static void main(String[] args) {
        Feature1 f1 = new Feature1();
        Feature2 f2 = new Feature2();
        Feature4 f4 = new Feature4();
        Feature5 f5 = new Feature5();
        Feature6 f6 = new Feature6();
        List<Student> lstS = new ArrayList<>();
        List<User> lstU = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        List<User> loginUser = UserAcc();
        List<User> loginAdmin = AdminAcc();

        System.out.println("Admin or Worker??");
        String cf = sc.nextLine();
        if (cf.toLowerCase().equals("a")) {
            menuAdmin();
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    lstS = f1.input();
                    f1.display(lstS);
                    f1.addStudent(lstS);
                    f1.display(lstS);
                    f1.removeStudent(lstS);
                    f1.display(lstS);
                    f1.updateStudent(lstS);
                    f1.display(lstS);
                    break;
                case 2:
                    lstS = f1.input();
                    f1.display(lstS);
                    f2.deleteMark(lstS);
                    f1.display(lstS);
                    f2.updateMark(lstS);
                    f1.display(lstS);
                    break;
                case 3:

                    break;
                case 4:
                    lstU = UserAcc();
                    f4.display(lstU);
                    f4.addUser(lstU);
                    f4.display(lstU);
                    f4.removeUser(lstU);
                    f4.display(lstU);
                    f4.updateUser(lstU);
                    f4.display(lstU);
                    break;
                case 5:
                    lstS = f1.input();
                    f5.calPercent(lstS);                   
                    break;
                case 6:
                    lstU = AdminAcc();
                    f6.display(lstU);
                    f6.login(lstU);
                    f6.changUserPass(lstU);
                    f6.display(lstU);
                    f6.logout();
                    break;
            }
        } else if (cf.toLowerCase().equals("w")) {
            menuWorker();
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    
                    break;
                case 2:
                    lstU = AdminAcc();
                    f6.display(lstU);
                    f6.login(lstU);
                    f6.changUserPass(lstU);
                    f6.display(lstU);
                    f6.logout();
                    break;
            }
        }
    }

}
