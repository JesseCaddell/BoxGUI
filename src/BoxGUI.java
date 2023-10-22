import javax.swing.*;
import java.awt.*;
public class BoxGUI extends JFrame {
    private JTextField lengthField, widthField, heightField;
    private JLabel lengthLabel, widthLabel, heightLabel;
    private JButton calculateVolumeButton, calculateSurfaceAreaButton, displayDetailsButton;

    public BoxGUI() {
        //JFrame set up
        setTitle("Box Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));

        //Create JLabels
        lengthLabel = new JLabel("Length: ");
        widthLabel = new JLabel("Width: ");
        heightLabel = new JLabel("Height: ");

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
    }

}
