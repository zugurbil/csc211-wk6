import javax.swing.*;
import java.awt.*;

public class SwingExample4 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        // Set the background color to red
        frame.getContentPane().setBackground(Color.RED);
        
        // Create a label
        JLabel label = new JLabel("This is a label");
        
        // Create three buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        
        // Add the label and buttons to the frame
        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
