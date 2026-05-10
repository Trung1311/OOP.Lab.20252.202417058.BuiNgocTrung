package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Tạo store và cart
        Cart cart = new Cart();
        
        // Tạo một số DVD
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
        
        // In tổng tiền
        System.out.println("Total cost: " + cart.totalCost());
    }
}