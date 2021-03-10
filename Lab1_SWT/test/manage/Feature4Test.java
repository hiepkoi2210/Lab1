/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import entity.User;
import java.util.ArrayList;
import java.util.List;
import static main.main.UserAcc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class Feature4Test {
    
    Feature4 f4;
    
    public Feature4Test() {
        f4 = new Feature4();
        
    }
    
    public static List<User> UserAcc() {
        List<User> list = new ArrayList<>();
        list.add(new User("User1", "Hiep", "123", 1));
        list.add(new User("User2", "Thanh", "123", 1));
        list.add(new User("User3", "Long", "123", 1));
        return list;
    }
    
    List<User> lstUser = UserAcc();
    @Test
    public void testAddUser(){
        int rs = f4.addUserT(lstUser, "User4", "Dung", "123");
        
        int expected = lstUser.size();
        assertEquals(expected, rs);
    }
    
    @Test
    public void testRemoveUser(){
        boolean rs = f4.removeUserT(lstUser, "User3");
        boolean expected = true;
        assertEquals(expected, rs);
    }
    
    @Test
    public void testUpdateUser(){
        boolean rs = f4.updateUserT(lstUser, "User1", "Dung", "1234");
        boolean expected = true;
        assertEquals(expected, rs);
    }
    

    
}
