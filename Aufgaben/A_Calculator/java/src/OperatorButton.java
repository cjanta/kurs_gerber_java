package Aufgaben.A_Calculator.java.src;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class OperatorButton extends BaseButton {

    String operator;

    public OperatorButton(JTextField outLabel, String operator) {
        super(outLabel);
        this.operator = operator;
        setText(operator);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        outLabel.setText(outLabel.getText() + " " + operator);
    }
}
