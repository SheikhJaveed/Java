import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventHandler extends JFrame implements MouseListener {
    
    private JLabel label;
    
    public MouseEventHandler() {
        setTitle("Mouse Event Handling");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a label to display mouse event messages
        label = new JLabel("No mouse event yet");
        add(label, BorderLayout.CENTER);
        
        // Add mouse listener to the frame
        addMouseListener(this);
        
        setVisible(true);
    }
    
    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at X: " + e.getX() + ", Y: " + e.getY());
    }
    
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at X: " + e.getX() + ", Y: " + e.getY());
    }
    
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at X: " + e.getX() + ", Y: " + e.getY());
    }
    
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered at X: " + e.getX() + ", Y: " + e.getY());
    }
    
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited at X: " + e.getX() + ", Y: " + e.getY());
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MouseEventHandler();
            }
        });
    }
}
