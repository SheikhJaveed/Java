import java.awt.*;
import java.awt.event.*;

public class AdapterClass extends Frame {
    public AdapterClass(){
        // Set frame properties
        setTitle("Mouse Adapter Demo");
        setSize(300, 200);

        // Add mouse listener using adapter class
        addMouseListener(new MyMouseAdapter());

        // Add window listener to handle closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Make frame visible
        setVisible(true);
    }

    // Custom adapter class for mouse events
    class MyMouseAdapter extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
        }

        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
        }

        public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
        new AdapterClass();
    }
}
