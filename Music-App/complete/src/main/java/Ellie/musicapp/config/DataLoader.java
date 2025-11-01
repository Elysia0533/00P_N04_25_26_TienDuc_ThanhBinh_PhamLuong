package Ellie.musicapp.config;

import Ellie.musicapp.model.Artist;
import Ellie.musicapp.repository.ArtistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ArtistRepository artistRepository;

    public DataLoader(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (artistRepository.count() == 0) {
            Artist a1 = new Artist("Aimer", "Japan");
            Artist a2 = new Artist("Yoasobi", "Japan");
            Artist a3 = new Artist("Sawano Hiroyuki", "Japan");
            artistRepository.save(a1);
            artistRepository.save(a2);
            artistRepository.save(a3);
            System.out.println(" Đã thêm dữ liệu mẫu cho artist!");
        }
    }
}