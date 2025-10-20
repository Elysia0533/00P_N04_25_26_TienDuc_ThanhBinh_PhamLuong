package Ellie.musicapp.Component;

import Ellie.musicapp.model.User;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class WriteToFile {

    private static final String FILE_PATH = "./complete/File/Login.txt";

    public void saveLoginHistory(List<User> users) {
        if (users == null || users.isEmpty()) {
            System.out.println("Không có người dùng nào để ghi!");
            return;
        }

        try {
            File file = new File(FILE_PATH);
            file.getParentFile().mkdirs(); // tạo thư mục nếu chưa có

            FileWriter writer = new FileWriter(file, true); // append = true
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = LocalDateTime.now().format(formatter);

            for (User user : users) {
                writer.write("[" + timestamp + "] User: " + user.getUsername() + " (" + user.getEmail() + ") logged in.\n");
            }

            writer.close();
            System.out.println("Đã ghi danh sách đăng nhập vào file!");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file login history!");
            e.printStackTrace();
        }
    }

    public void logUserLogin(User user) {
        if (user == null) {
            System.out.println("Không có dữ liệu người dùng để ghi!");
            return;
        }

        try {
            File file = new File(FILE_PATH);
            file.getParentFile().mkdirs();

            FileWriter writer = new FileWriter(file, true);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = LocalDateTime.now().format(formatter);

            writer.write("[" + timestamp + "] User: " + user.getUsername() + " (" + user.getEmail() + ") logged in.\n");
            writer.close();

            System.out.println("Ghi log đăng nhập thành công cho user: " + user.getUsername());
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi log đăng nhập!");
            e.printStackTrace();
        }
    }
}
