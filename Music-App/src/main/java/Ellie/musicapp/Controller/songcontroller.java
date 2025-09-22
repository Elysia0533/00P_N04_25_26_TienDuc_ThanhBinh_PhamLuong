/*package Ellie.musicapp.controller;

import Ellie.musicapp.model.Song;
import Ellie.musicapp.service.SongManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private SongManager songManager;

    // Tạo bài hát mới
    @PostMapping
    public void createSong(@RequestBody Song song) {
        songManager.createSong(song);
    }

    // Lấy danh sách tất cả bài hát
    @GetMapping
    public List<Song> getAllSongs() {
        return songManager.readAllSongs();
    }

    // Cập nhật bài hát theo id
    @PutMapping("/{id}")
    public void updateSong(@PathVariable Long id, @RequestBody Song song) {
        songManager.updateSong(id, song);
    }

    // Xóa bài hát theo id
    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable Long id) {
        songManager.deleteSong(id);
    }
}
*/