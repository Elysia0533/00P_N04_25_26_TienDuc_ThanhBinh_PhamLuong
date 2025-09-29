package Ellie.musicapp.repository;

import Ellie.musicapp.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
