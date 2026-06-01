package hust.soict.hedspi.aims.screen.customer.controller;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;

public class ItemController {

    @FXML
    private Button btnAddToCart;

    @FXML
    private Button btnPlay;

    @FXML
    private Label lblCost;

    @FXML
    private Label lblTitle;

    private Media media;
    private Cart cart;

    public ItemController(Cart cart) {
        this.cart = cart;
    }

    public void setData(Media media) {
        this.media = media;
        lblTitle.setText(media.getTitle());
        lblCost.setText(media.getCost() + " $");
        if (media instanceof Playable) {
            btnPlay.setVisible(true);
            btnPlay.setManaged(true);
        } else {
            btnPlay.setVisible(false);
            btnPlay.setManaged(false); // remove from layout calculation
            HBox.setMargin(btnAddToCart, new Insets(0, 0, 0, 0));
        }
    }

    @FXML
    void btnAddToCartClicked(ActionEvent event) {
        if (cart != null) {
            cart.addMedia(media);
            System.out.println("Added " + media.getTitle() + " to cart.");
        }
    }

    @FXML
    void btnPlayClicked(ActionEvent event) {
        if (media instanceof Playable) {
            ((Playable) media).play();
        }
    }
}
