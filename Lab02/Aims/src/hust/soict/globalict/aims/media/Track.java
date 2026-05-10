package hust.soict.globalict.aims.media;

public class Track implements Playable  {
    private String title;
    private int length;
    
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    
    public String getTitle() { return title; }
    public int getLength() { return length; }
    
    public String toString() {
        return "Track - " + title + " - " + length;
    }
    public void play() {
        if (this.length > 0) {
            System.out.println("Playing track: " + this.title);
            System.out.println("Track length: " + this.length);
        } else {
            System.out.println("Cannot play track: " + this.title);
        }
    }
}