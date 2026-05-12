package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;

import javax.swing.*;
import java.awt.*;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        if (media instanceof Playable) {
            JButton playButton = new JButton("Play");
            playButton.addActionListener(e -> {
                JDialog dialog = new JDialog();
                dialog.setTitle("Playing: " + media.getTitle());
                dialog.setSize(300, 150);
                dialog.setLocationRelativeTo(null);
                dialog.setModal(true);

                JPanel panel = new JPanel(new BorderLayout(10, 10));
                panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
                JLabel msg = new JLabel("<html><center>Now playing:<br><b>"
                        + media.getTitle() + "</b><br>Cost: "
                        + media.getCost() + " $</center></html>",
                        SwingConstants.CENTER);
                panel.add(msg, BorderLayout.CENTER);

                JButton closeBtn = new JButton("Close");
                closeBtn.addActionListener(ev -> dialog.dispose());
                JPanel btnPanel = new JPanel();
                btnPanel.add(closeBtn);
                panel.add(btnPanel, BorderLayout.SOUTH);

                dialog.add(panel);
                ((Playable) media).play();
                dialog.setVisible(true);
            });
            container.add(playButton);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
