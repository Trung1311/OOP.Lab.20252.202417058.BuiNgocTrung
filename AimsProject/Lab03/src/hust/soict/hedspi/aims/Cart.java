package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (disc == null) {
            System.out.println("The disc is null");
            return;
        }
        itemsOrdered.add(disc);
        System.out.println("The disc has been added");
    }

    public float totalCost() {
        float sum = 0;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            sum += dvd.getCost();
        }
        return sum;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i));
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.getId() == id) {
                System.out.println(dvd);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with id: " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.isMatch(title)) {
                System.out.println(dvd);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }
}
