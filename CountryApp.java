import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryApp extends JFrame {
    public CountryApp() {
        setTitle("Country Display App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create buttons
        JButton indiaButton = new JButton("India");
        JButton usaButton = new JButton("USA");
        
        // Add action listeners to buttons
        indiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "I am in India");
            }
        });
        
        usaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "I am in USA");
            }
        });
        
        // Create panel to hold buttons
        JPanel panel = new JPanel();
        panel.add(indiaButton);
        panel.add(usaButton);
        
        // Add panel to the frame
        add(panel);
        
        // Adjust frame size and make it visible
        pack();
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CountryApp();
            }
        });
    }
}
