package Ellie.musicapp.Controller;

import Ellie.musicapp.model.Artist;
import Ellie.musicapp.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ArtistViewController {

    @Autowired
    private ArtistRepository artistRepository;

    @GetMapping("/artists")
    public String showArtists(Model model) {
        List<Artist> artists = artistRepository.findAll();
        model.addAttribute("artists", artists);
        return "artists";
    }
}
