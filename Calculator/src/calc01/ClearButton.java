package calc01;

import java.awt.event.ActionEvent;

public class ClearButton extends BaseButton{

    public ClearButton(OutputField outputField, String text) {
        super(outputField);
        setText(text);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	outputField.clear();
    }  
}
