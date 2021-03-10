package manage;

import entity.Student;
import entity.User;
import java.util.ArrayList;
import java.util.List;
import static main.main.AdminAcc;
import static main.main.UserAcc;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alienware
 */
public class Feature6Test {

    Feature6 f6;

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

    List<User> lstU = new ArrayList<>();
    List<Student> lstS = new ArrayList<>();

    List<User> loginUser = UserAcc();
    List<User> loginAdmin = AdminAcc();

    public Feature6Test() {
        f6 = new Feature6();
    }

    @Test
    public void testLogin() {
        boolean rs = f6.login(loginAdmin,"Hiep", "000");
        boolean expected = true;
        assertEquals(expected, rs);
    }
    public void testLogin1() {
        boolean rs = f6.login(loginUser,"Hiep", "123");
        boolean expected = true;
        assertEquals(expected, rs);
    }
    



    @Test
    public void testChangUserPass() {
        boolean rs = f6.changUserPass(loginAdmin,"Admin1", "2");
        boolean expected = true;
        assertEquals(expected, rs);
    }


}
