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
    }
}