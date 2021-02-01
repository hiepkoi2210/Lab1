/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import entity.User;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USE
 */
public class Feature6 {

    private Validate check;
    Scanner sc = new Scanner(System.in);

    public void login(List<User> list) {
        System.out.println("Login!!!");
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getName().equals(username) && u.getPassword().equals(password)) {
                System.out.println("Login Succesfull");
            } else {
                System.out.println("Login fail");
            }
        }
    }

    public void logout() {
        System.out.println("Do you want to logout?");
        String cf = sc.nextLine();
        if (cf.toLowerCase().equals("yes")) {
            System.exit(0);
        }
    }

    public void changUserPass(List<User> list) {
        System.out.println("Change User Pass");
        System.out.println("Enter Code:");
        String code = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            User e = list.get(i);
            if (e.getCode().equals(code)) {
                System.out.println("Enter new password: ");
                e.setPassword(sc.nextLine());
                System.out.println("Change pass successfully");
                return;
            }
        }
        System.out.println("code does not exist");
    }

    public void display(List<User> list) {
        for (User e : list) {
            System.out.println(e);
        }
    }

}
