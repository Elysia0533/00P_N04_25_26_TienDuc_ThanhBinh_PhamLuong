package Ellie.musicapp.service;

import Ellie.musicapp.model.Song;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SongManager{
    private List<Song> songs;
    private final String FILE_NAME = "song.dat";

    public songManager(){
        song = readFromFile();
    }
public void addSong(Song song){
    songs.add(song);
    saveToFile();
}
public List<Song> getAllSongs(){
    return songs;
}
public void updateSong(long id, Song newSong){
    for(int i = 0; i < song.size(); i++){
        if (songs.get(i).getId().equals(id)){
            songs.set(i,newSong);
            saveToFile();
            break;
        }
    }
}
public void deleteSong(Long id){
    songs.removeIf(s -> s.getId().equals(id));
}
private void saveTofile(){
    try(ObjectOutputStream ooc = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
        oos.writrObject(songs);

    }
catch(IOException e){
    e.printStackTrace();
}
}
private List<Song> readFromFile(){
    File file = new File(FILE_NAME);
    if(!file.exists()){
        return new ArrayList<>();
    }
    try(ObjectInputStream ois = new ObjecInputStream(new FileInputStream(FILE_NAME))){
        return(List<Song>)ois.readObject();
    }catch(IOExcepion | ClassNotFoundException e){
        e.printStackTrace();
        return newArrayList<>();
    }
}
}