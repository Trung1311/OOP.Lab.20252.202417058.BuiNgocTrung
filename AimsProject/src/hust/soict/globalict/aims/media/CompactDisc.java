package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    
    public CompactDisc(String title, String category, 
                       String director, String artist, float cost) {
        super(title, category, director, 0, cost);
        this.artist = artist;
    }
    
    public String getArtist() { return artist; }
    
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Added track: " + track.getTitle());
        } else {
            System.out.println("Track already exists!");
        }
    }
    
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Removed track: " + track.getTitle());
        } else {
            System.out.println("Track not found!");
        }
    }
    
    public int getLength() {
        int total = 0;
        for (Track t : tracks) {
            total += t.getLength();
        }
        return total;
    }
    
    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory()
             + " - " + artist + " - " + getDirector()
             + " - " + getLength() + ": " + getCost() + " $";
    }
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track t : tracks) {
            t.play();
        }
    }
}