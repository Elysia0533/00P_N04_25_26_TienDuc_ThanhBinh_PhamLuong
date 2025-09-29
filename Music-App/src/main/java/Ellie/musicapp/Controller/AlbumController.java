package Ellie.musicapp.Controller;

import Ellie.musicapp.model.Album;
import Ellie.musicapp.repository.AlbumRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/albums")
public class AlbumController {
    private final AlbumRepository repo;

    public AlbumController(AlbumRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Album> all() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Album> one(@PathVariable Long id) {
        return repo.findById(id);
    }

    @PostMapping
    public Album create(@RequestBody Album a) {
        return repo.save(a);
    }

    @PutMapping("/{id}")
    public Album update(@PathVariable Long id, @RequestBody Album a) {
        return repo.findById(id).map(existing -> {
            existing.setTitle(a.getTitle());
            existing.setYear(a.getYear());
            existing.setArtist(a.getArtist());
            return repo.save(existing);
        }).orElseGet(() -> {
            a.setId(id);
            return repo.save(a);
        });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
