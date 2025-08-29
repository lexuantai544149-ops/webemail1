package murach.data;

import murach.business.User;
import java.util.ArrayList;
import java.util.List;

public class UserDB {
    // tạo list để lưu user tạm thời (demo)
    private static List<User> users = new ArrayList<>();

    public static void insert(User user) {
        users.add(user);
        System.out.println("User added: " + user.getEmail());
    }

    public static List<User> getAll() {
        return users;
    }
}
