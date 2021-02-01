/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USE
 */
public class Feature4 {
  
    private Validate check;
    Scanner sc = new Scanner(System.in);
   
    
    public void display(List<User> list) {
        for (User e : list) {
            System.out.println(e);
        }
    }
    
    public void addUser(List<User> list) {    
        System.out.println("Add User!!");
        System.out.println("Enter code: ");
        String code = sc.nextLine();
        System.out.println("Enter user name: ");
        String name = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        User u = new User(code, name, password, 1);
        list.add(u);
        System.out.println("Add new worker successfully");
    }

    public void removeUser(List<User> list) {
        System.out.println("Remove User!!");
        System.out.println("Enter name: ");
        String code = sc.nextLine();
        int size = list.size();

        for (int i = 0; i < size; i++) {
            User e = list.get(i);
            if (e.getCode().equals(code)) {
                list.remove(i);               
                System.out.println("Remove successfully");
                return;
            }
        }
        System.out.println("Name does not exist");
    }
    
    public void updateUser(List<User> list){
        System.out.println("Update User");
        System.out.println("Enter Code:");
        String code = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            User e = list.get(i);
            if (e.getCode().equals(code)) {
                System.out.println("Enter new name: ");
                e.setName(sc.nextLine());               
                System.out.println("Update name successfully");
                System.out.println("Enter new password: ");
                e.setPassword(sc.nextLine());
                System.out.println("Update user successfully");
                return;
            }
        }
        System.out.println("code does not exist");
    }
    
}
