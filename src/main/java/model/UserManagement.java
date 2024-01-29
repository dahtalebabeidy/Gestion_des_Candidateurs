package model;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
	private static List<User> userList = new ArrayList<>();

    public static void addUser(User user) {
        userList.add(user);
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(userList);
    }

    public static User getUserByUsername(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
