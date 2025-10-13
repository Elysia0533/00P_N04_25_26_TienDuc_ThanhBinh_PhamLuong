package Ellie.musicapp.service;

import Ellie.musicapp.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    // Danh sach nguoi dung
    private List<User> users = new ArrayList<>();

    // create
    public void createUser(User user) {

        users.add(user);
        System.out.println("Da tao thanh cong nguoi dung: " + user);
    }

    // read
    public List<User> readUsers() {

        return users;
    }

    // update
    public void updateUser(String id, String newUsername, String newEmail) {

        for (User u : users) {

            if (u.getId().equals(id)) {

                u.setUsername(newUsername);
                u.setEmail(newEmail);
                System.out.println("Cap nhat thanh cong nguoi dung: " + u);
                return;
            }
        }
        System.out.println("Khong tim thay nguoi dung co id: " + id);
    }

    // delete
    public void deleteUser(String id) {

        boolean removed = users.removeIf(u -> u.getId().equals(id));

        if (removed) {
            System.out.println("Da xoa nguoi dung voi id: " + id);
        } else {
            System.out.println("Khong tim thay nguoi dung co id: " + id);
        }
    }
}
