package Aufgaben.A_Calculator.java.src;

import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class OperatorButton extends BaseButton {

    String operator;

    public OperatorButton(JLabel outLabel, String operator) {
        super(outLabel);
        this.operator = operator;

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        outLabel.setText(outLabel.getText() + " " + operator);
    }
}
