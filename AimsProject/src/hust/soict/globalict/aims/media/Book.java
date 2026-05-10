package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();
    
    public Book() { super(); }
    
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Added author: " + authorName);
        } else {
            System.out.println("Author already exists: " + authorName);
        }
    }
    
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Removed author: " + authorName);
        } else {
            System.out.println("Author not found: " + authorName);
        }
    }
    
    public String toString() {
        return "Book - " + getTitle() + " - " + getCategory()
             + " - " + authors.toString()
             + ": " + getCost() + " $";
    }
}