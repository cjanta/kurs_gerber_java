package Aufgaben.A_Calculator.java.src;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

public class ClearButton extends BaseButton{

    public ClearButton(JTextField outLabel, String text) {
        super(outLabel);
        setText(text);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       outLabel.setText("");
    }  
}
