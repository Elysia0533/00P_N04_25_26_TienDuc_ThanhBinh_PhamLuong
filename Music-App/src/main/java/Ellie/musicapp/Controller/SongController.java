package Ellie.musicapp.controller;

import Ellie.musicapp.model.Song;
import Ellie.musicapp.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/songs")
public class SongController {

    private final SongService service;

    public SongController(SongService service) {
        this.service = service;
    }

    @GetMapping
    public String listSongs(Model model) {
        model.addAttribute("songs", service.getAll());
        return "songs"; // -> templates/songs.html
    }

    @PostMapping
    public String addSong(@ModelAttribute Song song) {
        service.save(song);
        return "redirect:/songs";
    }

    @GetMapping("/delete/{id}")
    public String deleteSong(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/songs";
    }
}
