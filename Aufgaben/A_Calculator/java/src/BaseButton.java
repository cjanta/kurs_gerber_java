package Aufgaben.A_Calculator.java.src;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BaseButton extends JButton implements ActionListener{

    JLabel outLabel;

    public BaseButton(JLabel outLabel){
        this.outLabel = outLabel;
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

   
   
    
}
