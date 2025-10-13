package Ellie.musicapp.Controller;

import Ellie.musicapp.model.Playlist;
import Ellie.musicapp.repository.PlaylistRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/playlists")
public class PlaylistController {
    private final PlaylistRepository repo;

    public PlaylistController(PlaylistRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Playlist> all() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Playlist> one(@PathVariable Long id) {
        return repo.findById(id);
    }

    @PostMapping
    public Playlist create(@RequestBody Playlist p) {
        return repo.save(p);
    }

    @PutMapping("/{id}")
    public Playlist update(@PathVariable Long id, @RequestBody Playlist p) {
        return repo.findById(id).map(existing -> {
            existing.setName(p.getName());
            existing.setUser(p.getUser());
            return repo.save(existing);
        }).orElseGet(() -> {
            p.setId(id);
            return repo.save(p);
        });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
