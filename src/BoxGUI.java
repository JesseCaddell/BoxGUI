import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoxGUI extends JFrame {
    private Box box;
    final private JTextField lengthField, widthField, heightField;
    final private JLabel lengthLabel, widthLabel, heightLabel;
    final private JButton calculateVolumeButton, calculateSurfaceAreaButton, displayDetailsButton;

    public BoxGUI(Box box) {
        this.box = box;

        //JFrame set up
        setTitle("Box Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,4));

        //Create JLabels
        lengthLabel = new JLabel("Length: ");
        widthLabel = new JLabel("Width: ");
        heightLabel = new JLabel("Height: ");
        //blankLabel = new JLabel("");

        //Create the JtextFields
        lengthField = new JTextField();
        widthField = new JTextField();
        heightField = new JTextField();


        // Create buttons
        calculateVolumeButton = new JButton("Calculate Volume");
        calculateSurfaceAreaButton = new JButton("Calculate Surface Area");
        displayDetailsButton = new JButton("Display Box Details");

        //ADD components to the JFrame
        add(lengthLabel);
        add(lengthField);
        add(widthLabel);
        add(widthField);
        add(heightLabel);
        add(heightField);
        add(calculateVolumeButton);
        add(calculateSurfaceAreaButton);
        add(displayDetailsButton);

        //action listeners
        calculateVolumeButton.addActionListener(e -> {
            try {
                double length = Double.parseDouble(lengthField.getText());
                double width = Double.parseDouble(widthField.getText());
                double height = Double.parseDouble(heightField.getText());
                double volume = length * width * height;

                //Update box instance with new values
                box.setLength(length);
                box.setWidth(width);
                box.setHeight(height);

                JOptionPane.showMessageDialog(BoxGUI.this, "Volume: " + volume, "Box Volume", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(BoxGUI.this, "Please enter valid double.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        calculateSurfaceAreaButton.addActionListener(e -> {
            try {
                double length = Double.parseDouble(lengthField.getText());
                double width = Double.parseDouble((widthField.getText()));
                double height = Double.parseDouble(heightField.getText());
                double surfaceArea = 2 * (length * width + length * height + width * height);

                //Update box instance with new values
                box.setLength(length);
                box.setWidth(width);
                box.setHeight(height);

                JOptionPane.showMessageDialog(BoxGUI.this, "Surface Area: " + surfaceArea, "Box Surface Area", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(BoxGUI.this, "Please enter valid doubles", "error", JOptionPane.ERROR_MESSAGE);
            }
        });

        displayDetailsButton.addActionListener(e -> {
            try {
                double length = Double.parseDouble(lengthField.getText());
                double width = Double.parseDouble(widthField.getText());
                double height = Double.parseDouble(heightField.getText());

                //Update box instance with new values
                box.setLength(length);
                box.setWidth(width);
                box.setHeight(height);

                String details = "Length: " + length + "\nWidth: " + width + "\nHeight: " + height;
                JOptionPane.showMessageDialog(BoxGUI.this, details, "Box Details", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(BoxGUI.this, "Please enter valid doubles.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });


        }

    //Getter methods for testing purposes
    public JTextField getLengthField() {
        return lengthField;
    }
    public JTextField getWidthField() {
        return widthField;
    }
    public JTextField getHeightField() {
        return heightField;
    }
    public JButton getCalculateVolumeButton() {
        return calculateVolumeButton;
    }
    public JButton getCalculateSurfaceAreaButton() {
        return calculateSurfaceAreaButton;
    }
    public JButton getDisplayDetailsButton() {
        return displayDetailsButton;
    }


}
