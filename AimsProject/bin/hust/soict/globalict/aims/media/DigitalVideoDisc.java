package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media implements Playable {
    private String director;
    private int length; // in minutes

    public DigitalVideoDisc() {
        super();
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() { return director; }
    public int getLength() { return length; }

    public void setDirector(String director) { this.director = director; }
    public void setLength(int length) { this.length = length; }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("Director: " + director);
        System.out.println("Length: " + length + " minutes");
    }

    @Override
    public String toString() {
        return "DVD [title=" + getTitle() + ", category=" + getCategory() +
               ", director=" + director + ", length=" + length +
               ", cost=" + getCost() + "]";
    }
}
