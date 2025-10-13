package Ellie.musicapp.service;

import Ellie.musicapp.model.Song;
import Ellie.musicapp.model.Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SongService {
    private List<Song> songs;

    public SongService() {
        this.songs = new ArrayList<>();
        // Dữ liệu mẫu
        songs.add(new Song(1, "The same dusk, The same sky", "KOHTA YAMAMOTO", "86 Original Sound Track", Genre.POP, "/music/Thesameduskthesamesky.mp3"));
        songs.add(new Song(2, "4n-SHIN", "Sawano Hiroyuki", "86 Original Sound Track", Genre.POP, "/music/4nshin.mp3"));
        songs.add(new Song(3, "TIAN TIAN", "Mili", "Limbus Company", Genre.POP, "/music/TIANTIAN.mp3"));
    }

    public List<Song> getAllSongs() {
        return songs;
    }

    public Song getSongById(int id) {
        return songs.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public List<Song> searchByTitle(String keyword) {
        return songs.stream()
                .filter(s -> s.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(int id) {
        songs.removeIf(s -> s.getId() == id);
    }
}

