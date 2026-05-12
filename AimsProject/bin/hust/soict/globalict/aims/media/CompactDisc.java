package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media implements Playable {
    private String artist;
    private String director;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc() {
        super();
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, cost);
        this.artist = artist;
    }

    public String getArtist() { return artist; }
    public String getDirector() { return director; }
    public List<Track> getTracks() { return tracks; }

    public void setArtist(String artist) { this.artist = artist; }
    public void setDirector(String director) { this.director = director; }

    public void addTrack(Track track) { tracks.add(track); }
    public void removeTrack(Track track) { tracks.remove(track); }

    public int getLength() {
        int total = 0;
        for (Track t : tracks) total += t.getLength();
        return total;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + getTitle());
        System.out.println("Artist: " + artist);
        for (Track t : tracks) t.play();
    }

    @Override
    public String toString() {
        return "CD [title=" + getTitle() + ", category=" + getCategory() +
               ", artist=" + artist + ", cost=" + getCost() + "]";
    }
}
