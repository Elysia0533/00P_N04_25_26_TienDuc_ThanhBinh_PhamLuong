package com.musicapp;

import com.example.musicapp.model.User;

public class TestUser {
    public static void main(String[] args) {
        User u1 = new User("u01", "Alice", "alice@mail.com");
        System.out.println(u1);

        u1.setUsername("");              // setter sẽ đổi thành "Unknown"
        u1.setEmail("notAnEmail");       // setter sẽ đổi thành "invalid@example.com"

        System.out.println("Sau khi chỉnh sửa:");
        System.out.println(u1);
    }
}
