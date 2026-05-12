package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfTitle;
    private JTextField tfCategory;
    private JTextField tfCost;
    private JTextField tfArtist;
    private JTextField tfDirector;

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add CD to Store");
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

        center.add(new JLabel("Artist:"));
        tfArtist = new JTextField();
        center.add(tfArtist);

        center.add(new JLabel("Director:"));
        tfDirector = new JTextField();
        center.add(tfDirector);

        center.add(new JLabel(""));
        center.add(new JLabel(""));

        return center;
    }

    @Override
    protected void addItemToStore() {
        String title = tfTitle.getText().trim();
        String category = tfCategory.getText().trim();
        String costStr = tfCost.getText().trim();
        String artist = tfArtist.getText().trim();
        String director = tfDirector.getText().trim();

        if (title.isEmpty() || costStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Title and Cost are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float cost = Float.parseFloat(costStr);
        CompactDisc cd = new CompactDisc(title, category, artist, cost);
        cd.setDirector(director);

        store.addMedia(cd);
        JOptionPane.showMessageDialog(this, "CD added successfully!\n" + cd.toString());

        tfTitle.setText("");
        tfCategory.setText("");
        tfCost.setText("");
        tfArtist.setText("");
        tfDirector.setText("");
    }
}
