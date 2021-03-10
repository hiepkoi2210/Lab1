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

    private Validate validate;
    Scanner sc = new Scanner(System.in);

    public Boolean login(List<User> list,String username, String password) {
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getName().equals(username) && u.getPassword().equals(password)) {
                check = true;
            }
        }
        return check;
    }

    public void logout() {
        System.out.println("Do you want to logout?");
        String cf = sc.nextLine();
        if (cf.toLowerCase().equals("yes")) {
            System.exit(0);
        }
    }

    public Boolean changUserPass(List<User> list,String code, String newpass) {
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            User e = list.get(i);
            if (e.getCode().equals(code)) {
                e.setPassword(newpass);
                System.out.println("Change pass successfully");
                check = true;
            }
        }
        return check;
    }

    public void display(List<User> list) {
        for (User e : list) {
            System.out.println(e);
        }
    }

}
