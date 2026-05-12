package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfTitle;
    private JTextField tfCategory;
    private JTextField tfCost;
    private JTextField tfDirector;
    private JTextField tfLength;

    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add DVD to Store");
    }

    @Override
    protected JPanel createCenter() {
        JPanel center = new JPanel(new GridLayout(6, 2, 10, 10));
        center.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        center.add(new JLabel("Title:"));
        tfTitle = new JTextField();
        center.add(tfTitle);

        center.add(new JLabel("Category:"));
        tfCategory = new JTextField();
        center.add(tfCategory);

        center.add(new JLabel("Cost ($):"));
        tfCost = new JTextField();
        center.add(tfCost);

        center.add(new JLabel("Director:"));
        tfDirector = new JTextField();
        center.add(tfDirector);

        center.add(new JLabel("Length (minutes):"));
        tfLength = new JTextField();
        center.add(tfLength);

        center.add(new JLabel(""));
        center.add(new JLabel(""));

        return center;
    }

    @Override
    protected void addItemToStore() {
        String title = tfTitle.getText().trim();
        String category = tfCategory.getText().trim();
        String costStr = tfCost.getText().trim();
        String director = tfDirector.getText().trim();
        String lengthStr = tfLength.getText().trim();

        if (title.isEmpty() || costStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Title and Cost are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float cost = Float.parseFloat(costStr);
        int length = lengthStr.isEmpty() ? 0 : Integer.parseInt(lengthStr);

        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);

        store.addMedia(dvd);
        JOptionPane.showMessageDialog(this, "DVD added successfully!\n" + dvd.toString());

        tfTitle.setText("");
        tfCategory.setText("");
        tfCost.setText("");
        tfDirector.setText("");
        tfLength.setText("");
    }
}
