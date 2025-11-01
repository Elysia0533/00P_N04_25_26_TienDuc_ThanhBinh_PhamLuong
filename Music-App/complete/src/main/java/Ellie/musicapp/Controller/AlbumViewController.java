package Ellie.musicapp.Controller;

import Ellie.musicapp.model.Album;
import Ellie.musicapp.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class AlbumViewController {

    @Autowired
    private AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String showAlbums(Model model) {
        List<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "albums";
    }
}
