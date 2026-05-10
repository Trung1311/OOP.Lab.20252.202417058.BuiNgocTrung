package hust.soict.globalict.aims.disc;

public class DigitalVideoDisc {
	public boolean isMatch(String title) {
	    return this.title.toLowerCase().contains(title.toLowerCase());
	}
    private static int nbDigitalVideoDiscs = 0;
    
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    // Constructor chỉ có title
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    
    // Constructor có category và cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    
    // Constructor đầy đủ
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    
    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }
    
    // Setters
    public void setTitle(String title) { this.title = title; }
    
    public String toString() {
        return "DVD - " + title + " - " + category 
             + " - " + director + " - " + length 
             + ": " + cost + " $";
    }
    
}