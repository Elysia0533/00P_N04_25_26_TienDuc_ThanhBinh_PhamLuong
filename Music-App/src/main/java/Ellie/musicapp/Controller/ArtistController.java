package Ellie.musicapp.Controller;

import Ellie.musicapp.model.Artist;
import Ellie.musicapp.repository.ArtistRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/artists")
public class ArtistController {
    private final ArtistRepository repo;

    public ArtistController(ArtistRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Artist> all() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Artist> one(@PathVariable Long id) {
        return repo.findById(id);
    }

    @PostMapping
    public Artist create(@RequestBody Artist a) {
        return repo.save(a);
    }

    @PutMapping("/{id}")
    public Artist update(@PathVariable Long id, @RequestBody Artist a) {
        return repo.findById(id).map(existing -> {
            existing.setName(a.getName());
            existing.setCountry(a.getCountry());
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
