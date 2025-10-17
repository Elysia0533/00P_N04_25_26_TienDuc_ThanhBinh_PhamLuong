package Ellie.musicapp.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    // Hàm đọc lịch sử đăng nhập từ file
    public void showLoginHistory() {
        String filePath = "./complete/File/Login.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Danh sách người dùng đã đăng nhập:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc file: " + filePath);
            e.printStackTrace();
        }
    }
}
