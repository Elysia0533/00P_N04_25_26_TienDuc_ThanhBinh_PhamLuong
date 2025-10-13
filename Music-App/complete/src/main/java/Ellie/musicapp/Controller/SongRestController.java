package Ellie.musicapp.Controller;

import Ellie.musicapp.model.Song;
import Ellie.musicapp.repository.SongRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/songs")
@CrossOrigin(origins = "*") // Cho phép gọi API từ frontend khác
public class SongRestController {

    private final SongRepository repo;
    public SongRestController(SongRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Song> all() { return repo.findAll(); }

    @GetMapping("/{id}")
    public Optional<Song> one(@PathVariable Long id) { return repo.findById(id); }

    @PostMapping
    public Song create(@RequestBody Song s) { return repo.save(s); }

    @PutMapping("/{id}")
    public Song update(@PathVariable Long id, @RequestBody Song s) {
        return repo.findById(id).map(existing -> {
            existing.setTitle(s.getTitle());
            existing.setDuration(s.getDuration());
            existing.setArtist(s.getArtist());
            existing.setAlbum(s.getAlbum());
            existing.setGenre(s.getGenre());
            return repo.save(existing);
        }).orElseGet(() -> { s.setId(id); return repo.save(s); });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { repo.deleteById(id); }
}
