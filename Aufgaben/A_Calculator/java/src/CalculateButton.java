package Aufgaben.A_Calculator.java.src;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

public class CalculateButton extends BaseButton {

    public CalculateButton(JTextField outLabel, String text) {
        super(outLabel);
        setText(text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
