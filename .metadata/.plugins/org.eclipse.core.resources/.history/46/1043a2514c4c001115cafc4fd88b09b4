package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class Aims {
    public static void main(String[] args) {
        // Tạo store
        Store store = new Store();
        
        // Tạo DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
            "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        
        // Tạo Book
        Book book1 = new Book("Harry Potter", "Fantasy", 29.95f);
        book1.addAuthor("J.K. Rowling");
        
        // Tạo CD
        CompactDisc cd1 = new CompactDisc(
            "Thriller", "Pop", "John Landis", "Michael Jackson", 9.95f);
        Track track1 = new Track("Thriller", 358);
        Track track2 = new Track("Billie Jean", 294);
        cd1.addTrack(track1);
        cd1.addTrack(track2);
        
        // Thêm vào store
        store.addMedia(dvd1);
        store.addMedia(book1);
        store.addMedia(cd1);
        
        // Tạo cart và thêm media
        Cart cart = new Cart();
        cart.addMedia(dvd1);
        cart.addMedia(book1);
        cart.addMedia(cd1);
        
        // In cart
        cart.print();
        
        // Test play
        System.out.println("\n--- Play media ---");
        dvd1.play();
        cd1.play();
     // Test equals
        System.out.println("\n--- Test equals ---");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
            "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        System.out.println("dvd1 equals dvd2: " + dvd1.equals(dvd2));

        Track track3 = new Track("Thriller", 358);
        System.out.println("track1 equals track3: " + track1.equals(track3));
     // Section 16 - Polymorphism với toString()
        System.out.println("\n--- Polymorphism with toString() ---");
        java.util.List<hust.soict.globalict.aims.media.Media> mediaList = 
            new java.util.ArrayList<>();
        mediaList.add(dvd1);
        mediaList.add(book1);
        mediaList.add(cd1);

        for (hust.soict.globalict.aims.media.Media m : mediaList) {
            System.out.println(m.toString());
        }
    }
}