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
    private final WriteToFile writeToFile = new WriteToFile();
    private final ReadFromFile readFromFile = new ReadFromFile();

    //API: thêm user (giả lập login)
    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String email) {
        User user = new User(username, email, "password123");
        users.add(user);
        writeToFile.saveLoginHistory(users);
        return "ser " + username + " đã đăng nhập và ghi file thành công!";
    }

    //API: đọc danh sách user đã đăng nhập
    @GetMapping("/history")
    public String getLoginHistory() {
        return readFromFile.readLoginHistory();
    }
}
