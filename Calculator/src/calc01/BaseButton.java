package calc01;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BaseButton extends JButton implements ActionListener{

    OutputField outputField;
    

    public BaseButton(OutputField outputField){
        this.outputField = outputField;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }  
    
    boolean isCalculationFinished() {
    	return outputField.getText().contains(ButtonFactory.CALCULATE);
    }
}
