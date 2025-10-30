package Ellie.musicapp.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/songs")
    public String songs() {
        return "songs";
    }

    @GetMapping("/playlists")
    public String playlists() {
        return "playlists";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @GetMapping("/artist")
    public String artist(Model model) {
        model.addAttribute("artist", new Object());
        model.addAttribute("songs", new Object());
        return "artist";
    }

    @GetMapping("/album")
    public String album(Model model) {
        model.addAttribute("album", new Object());
        return "album";
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("user", new Object());
        model.addAttribute("playlists", new Object());
        return "profile";
    }
}