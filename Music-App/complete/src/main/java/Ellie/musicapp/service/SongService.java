package Ellie.musicapp.service;

import Ellie.musicapp.model.*;
import java.util.ArrayList;
import java.util.List;

public class SongService {
    private List<Song> songs;

    public SongService() {
        this.songs = new ArrayList<>();

        Artist sawano = new Artist("Sawano Hiroyuki", "Japan");
        Artist mili = new Artist("Mili", "Japan");
        Artist yoasobi = new Artist("YOASOBI", "Japan");
        Artist alan = new Artist("Alan Walker", "UK");

        Album a86 = new Album("86 Original Soundtrack", 2021, sawano);
        Album limbus = new Album("Limbus Company", 2023, mili);
        Album theBook = new Album("THE BOOK", 2021, yoasobi);
        Album worldOfWalker = new Album("World of Walker", 2018, alan);

        Genre pop = new Genre();
        pop.setName("Pop");

        Genre electronic = new Genre();
        electronic.setName("Electronic");

        songs.add(new Song("The Same Dusk, The Same Sky", 240, "/images/86.jpg", sawano, a86, pop));
        songs.add(new Song("4-n SHIN", 220, "/images/4nshin.jpg", sawano, a86, pop));
        songs.add(new Song("Dancer in the Dark", 230, "/images/yoasobi.jpg", yoasobi, theBook, pop));
        songs.add(new Song("TIAN TIAN", 200, "/images/limbus.jpg", mili, limbus, pop));
        songs.add(new Song("Darkside", 210, "/images/alanwalker.jpg", alan, worldOfWalker, electronic));
        songs.add(new Song("Faded", 195, "/images/alanwalker.jpg", alan, worldOfWalker, electronic));
    }

    public List<Song> getAllSongs() {
        return songs;
    }

    public Song getSongById(Long id) {
        return songs.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Long id) {
        songs.removeIf(s -> s.getId().equals(id));
    }
}
