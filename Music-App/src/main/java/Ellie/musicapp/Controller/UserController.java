package Ellie.musicapp.Controller;

import Ellie.musicapp.model.User;
import Ellie.musicapp.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<User> all() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> one(@PathVariable Long id) {
        return repo.findById(id);
    }

    @PostMapping
    public User create(@RequestBody User u) {
        return repo.save(u);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User u) {
        return repo.findById(id).map(existing -> {
            existing.setUsername(u.getUsername());
            existing.setEmail(u.getEmail());
            existing.setPassword(u.getPassword());
            return repo.save(existing);
        }).orElseGet(() -> {
            u.setId(id);
            return repo.save(u);
        });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
