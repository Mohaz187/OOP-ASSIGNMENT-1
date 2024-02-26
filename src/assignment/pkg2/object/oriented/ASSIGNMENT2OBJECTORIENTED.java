import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetRadio extends JFrame implements ActionListener {
    private final JRadioButton birdButton;
    private final JRadioButton catButton;
    private final JRadioButton dogButton;
    private final JRadioButton rabbitButton;
    private final JRadioButton pigButton;
    private final JLabel pictureLabel;
    private final ButtonGroup group;

    public PetRadio() {
        super("Pet Radio");
        setLayout(new FlowLayout());

        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        pictureLabel = new JLabel(new ImageIcon("bird.jpg"));
        pictureLabel.setPreferredSize(new Dimension(300, 300));

        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);
        add(pictureLabel);

        birdButton.setSelected(true);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String pet = e.getActionCommand();
        switch (pet) {
            case "Bird":
                pictureLabel.setIcon(new ImageIcon("bird.jpg"));
                break;
            case "Cat":
                pictureLabel.setIcon(new ImageIcon("cat.jpg"));
                break;
            case "Dog":
                pictureLabel.setIcon(new ImageIcon("dog.jpg"));
                break;
            case "Rabbit":
                pictureLabel.setIcon(new ImageIcon("rabbit.jpg"));
                break;
            case "Pig":
                pictureLabel.setIcon(new ImageIcon("pig.jpg"));
                break;
        }
    }

    public static void main(String[] args) {
        new PetRadio();
    }
}
