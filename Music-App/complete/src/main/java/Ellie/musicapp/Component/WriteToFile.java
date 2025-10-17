package Ellie.musicapp.Component;

import Ellie.musicapp.model.User;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class WriteToFile {

    private static final String FILE_PATH = "./complete/File/Login.txt";

    public void logUserLogin(User user) {
        if (user == null) {
            System.out.println("No user data to log!");
            return;
        }

        try {
            File file = new File(FILE_PATH);
            file.getParentFile().mkdirs();

            FileWriter writer = new FileWriter(file, true);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = LocalDateTime.now().format(formatter);

            writer.write("[" + timestamp + "] ");
            writer.write("User: " + user.getUsername() + " (" + user.getEmail() + ") logged in.\n");

            writer.close();

            System.out.println("Login logged for user: " + user.getUsername());

        } catch (IOException e) {
            System.out.println("Error while writing login log!");
            e.printStackTrace();
        }
    }
}
