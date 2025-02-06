package Aufgaben.A_Calculator.java.src;

import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class NumberButton extends BaseButton {

    String value;

    public NumberButton(JLabel outLabel , String value) {
        super(outLabel);
        this.value = value;
        setText(value);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // wird nicht aufgerufen
        // outLabel.setText(outLabel.getText() + " " + value);
        outLabel.setText(value);
        System.out.println("Action");
    }
}
