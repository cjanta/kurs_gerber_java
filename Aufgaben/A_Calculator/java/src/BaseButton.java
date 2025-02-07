package Aufgaben.A_Calculator.java.src;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class BaseButton extends JButton implements ActionListener{

    JTextField outLabel;
    static final List<String> NUMBER_STRINGS = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9" );
    static final List<String> OPERATOR_STRINGS = List.of("+", "-", "*", "/" );
    static final String CLEAR = "clear";
    static final String CALCULATE = "calc";

    public BaseButton(JTextField outLabel){
        this.outLabel = outLabel;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }  
    
}
