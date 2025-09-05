package main.java.musicapp.model;

public class song {
    String title;
    String artistName;
    int durationInSecond;
    String filePath;

    public Song() {
        this.title = "Unknown Title";
        this.artistName = "Unknown Artist";
    }

    public Song(String title, String artistName, int durationInSecond, String filePath) {
        this.title = title;
        this.artistName = artistName;
        this.this.durationInSecond = durationInSecond;
        this.filePath = filePath;
    }
}
