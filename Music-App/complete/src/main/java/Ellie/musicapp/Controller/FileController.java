package Ellie.musicapp.Controller;

import Ellie.musicapp.Component.ReadFromFile;
import Ellie.musicapp.Component.WriteToFile;
import Ellie.musicapp.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {

    private final List<User> users = new ArrayList<>();

    private final WriteToFile writeToFile;
    private final ReadFromFile readFromFile;

    public FileController(WriteToFile writeToFile, ReadFromFile readFromFile) {
        this.writeToFile = writeToFile;
        this.readFromFile = readFromFile;
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String email) {
        User user = new User(username, email, "password123");
        users.add(user);

        writeToFile.saveLoginHistory(users);
        return "User " + username + " đã đăng nhập và ghi file thành công!";
    }

    @GetMapping("/history")
    public String getLoginHistory() {
        return readFromFile.readLoginHistory();
    }
}
