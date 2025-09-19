/*  public class Song {
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
        this.durationInSecond = durationInSecond;
        this.filePath = filePath;
    }
}
*/
package Ellie.musicapp.model;

import class Song implements Serializable{
    private Lon id;
    private String title;
    private int durationInSecond;
    private String filePath;

    public Song(){}
    public Song(long id, String title, int durationInSecond, String filePath){
        this.id = id;
        this.title = title;
        this.durationInsecond = durationInSecond;
        this.filePath = filePath;
    }
    public Long getId(){return id; }
    public void setId(Long id){this.id = id; }

    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title; }

public int getDurationInSecond(){return durationInSecond; }
public void setDurationInSecond(int durationInSecond){this.durationInSecond = durationInSecond; }

public String getFilePath(){ return filePath; }
public void setFilePath(String filePath){this.filePath = filePath; }

public String toString(){
    return "Song{"
    "id=" + id +
    ", title='" + title + '\'' +
    ", durationInSecond=" + durationInSecond +
    ", filePath='" + filePath + '\''+
    '}';
}
}