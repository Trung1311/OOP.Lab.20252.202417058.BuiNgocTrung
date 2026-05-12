package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Added to store: " + media.getTitle());
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Removed from store: " + media.getTitle());
        } else {
            System.out.println("Item not found in store.");
        }
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void printStore() {
        System.out.println("***********************STORE***********************");
        for (Media m : itemsInStore) {
            System.out.println(m.toString());
        }
        System.out.println("***************************************************");
    }
}
