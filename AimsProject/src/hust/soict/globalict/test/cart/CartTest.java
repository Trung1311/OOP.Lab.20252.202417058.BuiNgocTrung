package hust.soict.globalict.test.cart;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Tạo cart
        Cart cart = new Cart();
        
        // Tạo các DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
            "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
            "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
            "Aladin", "Animation", 18.99f);
        
        // Thêm vào cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        
        // Test print
        cart.print();
        
        // Test searchById
        System.out.println("\n--- Search by ID ---");
        cart.searchById(1);
        cart.searchById(5);
        
        // Test searchByTitle
        System.out.println("\n--- Search by Title ---");
        cart.searchByTitle("star");
        cart.searchByTitle("Batman");
        
        // Test remove
        System.out.println("\n--- Remove DVD ---");
        cart.removeDigitalVideoDisc(dvd2);
        cart.print();
    }
}