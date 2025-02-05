package Aufgaben.A3_1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingMe extends JFrame {
    
    public SwingMe(){
        setTitle("SwingMe Hello World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        label.setText("Hallo Swing!");
        add(label);
        pack();
        setVisible(true);
    }
}
