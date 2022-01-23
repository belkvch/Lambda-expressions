package ex14;

import java.util.*;

public class Main {
    static int compareUser(User a, User b) {
        return a.getID() - b.getID();
    }

    public static void main(String[] args) {
        ArrayList<User> staff = new ArrayList<User>();
        staff.add(new User(1));
        staff.add(new User(2));
        staff.add(new User(3));
        staff.add(new User(4));
        staff.add(new User(9));
        staff.add(new User(7));
        User maxUserID = Collections.max(staff, Main::compareUser);
        System.out.println("Максимальное значение равно: " + maxUserID.getID());
    }
}
