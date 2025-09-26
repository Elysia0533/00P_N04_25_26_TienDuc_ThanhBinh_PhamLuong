package Ellie.musicapp;

import Ellie.musicapp.model.User;
import Ellie.musicapp.service.UserService;

public class Musicapplication {
    public static void main(String[] args) {
        UserService service = new UserService();

        // create
        User u1 = new User("1", "A", "a123@gmail.com");
        User u2 = new User("2", "B", "b123@gmail.com");
        service.createUser(u1);
        service.createUser(u2);

        // read
        System.out.println("\n📌 Danh sach Users:");
        for (User u : service.readUsers()) {
            System.out.println(u);
        }

        // update
        service.updateUser("1", "anUpdated", "an@gmail.com");

        // delete
        service.deleteUser("2");

        // read sau khi update + delete
        System.out.println("\n Danh sach Users sau khi cap nhat la:");
        for (User u : service.readUsers()) {
            System.out.println(u);
        }
    }
}
