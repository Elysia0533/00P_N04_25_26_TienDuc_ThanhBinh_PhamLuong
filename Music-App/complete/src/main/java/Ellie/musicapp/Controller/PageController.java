package Ellie.musicapp.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import Ellie.musicapp.model.Artist;
import Ellie.musicapp.repository.ArtistRepository;


@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/songs-page")
    public String songsPage() {
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

    @Autowired
private ArtistRepository artistRepository;

    @GetMapping("/artist/{id}")
    public String artist(@PathVariable Long id, Model model) {
        Artist artist = artistRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Không tìm thấy nghệ sĩ ID: " + id));
        model.addAttribute("artist", artist);
        return "artist";
}


    @GetMapping("/album")
    public String album() {
        return "album";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }
}