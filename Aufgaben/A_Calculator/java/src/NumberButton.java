package Aufgaben.A_Calculator.java.src;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class NumberButton extends BaseButton {

    String text;

    public NumberButton(JTextField outLabel , String text) {
        super(outLabel);
        this.text = text;
        setText(text);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String currentText = outLabel.getText();

        String delimeter = isNumber(currentText.substring(currentText.length() - 1)) ? "" : " ";
        outLabel.setText(currentText + delimeter + text);
    }

    private boolean isNumber(String value){
        return NUMBER_STRINGS.contains(value);
    }
}
