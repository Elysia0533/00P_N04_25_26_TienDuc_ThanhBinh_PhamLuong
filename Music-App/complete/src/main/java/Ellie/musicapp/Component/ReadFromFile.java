package Ellie.musicapp.Component;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class ReadFromFile {

    private static final String FILE_PATH = "./complete/File/Login.txt";

    public void showLoginHistory() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            System.out.println("Danh sách người dùng đã đăng nhập:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("❌ Không thể đọc file: " + FILE_PATH);
            e.printStackTrace();
        }
    }

    public String readLoginHistory() {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            return "Không thể đọc file: " + FILE_PATH;
        }

        if (content.length() == 0) {
            return "File trống hoặc chưa có dữ liệu đăng nhập.";
        }

        return "Danh sách người dùng đã đăng nhập:\n" + content;
    }
}
