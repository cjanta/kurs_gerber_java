package Aufgaben.A_Calculator.java.src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener {


    public MainFrame(){
        setTitle("Taschenrechner (IHK-konform)");






        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
