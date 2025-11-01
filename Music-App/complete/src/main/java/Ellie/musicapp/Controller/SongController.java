package Ellie.musicapp.Controller;

import Ellie.musicapp.model.Song;
import Ellie.musicapp.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/songs")
public class SongController {
    private final SongService songService;

    public SongController() {
        this.songService = new SongService();
    }

    @GetMapping
    public String listSongs(Model model) {
        model.addAttribute("songs", songService.getAllSongs());
        return "songs";
    }

    @GetMapping("/{id}")
    public String songDetail(@PathVariable Long id, Model model) {
        Song song = songService.getSongById(id);
        if (song == null) {
            return "error";
        }
        model.addAttribute("song", song);
        return "song-detail";
    }
}
