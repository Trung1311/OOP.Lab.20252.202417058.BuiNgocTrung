package hust.soict.globalict.aims.media;

public abstract class Media {
    private static int nbMedias = 0;
    
    private int id;
    private String title;
    private String category;
    private float cost;
    
    public Media() {
        nbMedias++;
        this.id = nbMedias;
    }
    
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbMedias++;
        this.id = nbMedias;
    }
    
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public float getCost() { return cost; }
    public void setTitle(String title) { this.title = title; }
    public void setCost(float cost) { this.cost = cost; }
}