package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfTitle;
    private JTextField tfCategory;
    private JTextField tfCost;
    private JTextField tfAuthors;

    public AddBookToStoreScreen(Store store) {
        super(store);
        setTitle("Add Book to Store");
    }

    @Override
    protected JPanel createCenter() {
        JPanel center = new JPanel(new GridLayout(5, 2, 10, 10));
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

        center.add(new JLabel("Authors (comma-separated):"));
        tfAuthors = new JTextField();
        center.add(tfAuthors);

        center.add(new JLabel(""));
        center.add(new JLabel(""));

        return center;
    }

    @Override
    protected void addItemToStore() {
        String title = tfTitle.getText().trim();
        String category = tfCategory.getText().trim();
        String costStr = tfCost.getText().trim();
        String authorsStr = tfAuthors.getText().trim();

        if (title.isEmpty() || costStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Title and Cost are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float cost = Float.parseFloat(costStr);
        Book book = new Book(title, category, cost);

        if (!authorsStr.isEmpty()) {
            for (String author : authorsStr.split(",")) {
                book.addAuthor(author.trim());
            }
        }

        store.addMedia(book);
        JOptionPane.showMessageDialog(this, "Book added successfully!\n" + book.toString());

        // Clear form
        tfTitle.setText("");
        tfCategory.setText("");
        tfCost.setText("");
        tfAuthors.setText("");
    }
}
