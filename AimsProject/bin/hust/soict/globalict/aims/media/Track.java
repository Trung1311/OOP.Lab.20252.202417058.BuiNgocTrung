package hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private String title;
    private int length; // in seconds

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() { return title; }
    public int getLength() { return length; }

    @Override
    public void play() {
        System.out.println("  Playing track: " + title + " (" + length + "s)");
    }

    @Override
    public String toString() {
        return "Track [title=" + title + ", length=" + length + "s]";
    }
}
