package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
	public void print() {
	    System.out.println("***********************CART***********************");
	    System.out.println("Ordered Items:");
	    for (int i = 0; i < qtyOrdered; i++) {
	        System.out.println((i+1) + ". " + itemsOrdered[i].toString());
	    }
	    System.out.println("Total cost: " + totalCost());
	    System.out.println("***************************************************");
	}
	public void searchById(int id) {
	    boolean found = false;
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i].getId() == id) {
	            System.out.println("Found: " + itemsOrdered[i].toString());
	            found = true;
	        }
	    }
	    if (!found) {
	        System.out.println("No disc found with ID: " + id);
	    }
	}
	public void searchByTitle(String title) {
	    boolean found = false;
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i].isMatch(title)) {
	            System.out.println("Found: " + itemsOrdered[i].toString());
	            found = true;
	        }
	    }
	    if (!found) {
	        System.out.println("No disc found with title: " + title);
	    }
	}
    public static final int MAX_NUMBERS_ORDERED = 20;
    
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added: " + disc.getTitle());
        } else {
            System.out.println("The cart is already full");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed: " + disc.getTitle());
                return;
            }
        }
        System.out.println("Disc not found in cart");
    }
    
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}

