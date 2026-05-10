package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_ITEMS = 100;
    
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
    private int nbItems = 0;
    
    public void addDVD(DigitalVideoDisc dvd) {
        if (nbItems < MAX_ITEMS) {
            itemsInStore[nbItems] = dvd;
            nbItems++;
            System.out.println("Added to store: " + dvd.getTitle());
        } else {
            System.out.println("Store is full!");
        }
    }
    
    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < nbItems; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < nbItems - 1; j++) {
                    itemsInStore[j] = itemsInStore[j+1];
                }
                itemsInStore[nbItems-1] = null;
                nbItems--;
                System.out.println("Removed from store: " + dvd.getTitle());
                return;
            }
        }
        System.out.println("DVD not found in store!");
    }
}