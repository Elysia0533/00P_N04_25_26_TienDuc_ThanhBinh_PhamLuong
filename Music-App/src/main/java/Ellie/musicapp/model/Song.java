package Ellie.musicapp.model;

public class Song {

    private int id;
    private String title;
    private String artist;
    private String album;
    private Genre genre;
    private String filePath;

    public Song(int id, String title, String artist, String album, Genre genre, String filePath) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.filePath = filePath;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }

    public String getAlbum() { return album; }
    public void setAlbum(String album) { this.album = album; }

    public Genre getGenre() { return genre; }
    public void setGenre(Genre genre) { this.genre = genre; }

    public String getFilePath() { return filePath; }
    public void setFilePath(String filePath) { this.filePath = filePath; }

    @Override
    public String toString() {
        return "Song{" + "title='" + title + '\'' + ", artist='" + artist + '\'' + '}';
    }

}
