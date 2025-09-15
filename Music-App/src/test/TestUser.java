package Ellie.musicapp;

import Ellie.musicapp.model.User;

public class TestUser {
    public static void main(String[] args) {

        User u1 = new User("u01", "Yixuan", "Yixuan@mail.com");
        System.out.println("Thông tin ban đầu:");
        System.out.println(u1);

        u1.setUsername("Rin");
        u1.setEmail("Rin@example.com");

        System.out.println("\nSau khi cập nhật:");
        System.out.println("ID: " + u1.getId());
        System.out.println("Username: " + u1.getUsername());
        System.out.println("Email: " + u1.getEmail());
    }
}
