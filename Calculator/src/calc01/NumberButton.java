package calc01;

import java.awt.event.ActionEvent;

public class NumberButton extends BaseButton {

    String text;

    public NumberButton(OutputField outputField , String text) {
        super(outputField);
        this.text = text;
        setText(text);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	if(isCalculationFinished()) {
    		outputField.clear();
    	}
        String text = outputField.getText();

        String delimeter = isLastCharNumber(text) ? "" : " ";
        outputField.setText(text + delimeter + getText());
    }
    
    
    private boolean isLastCharNumber(String value){
		String last = value.isEmpty() ? "" : value.substring(value.length() - 1);	
		return ButtonFactory.NUMBER_STRINGS.contains(last);
    }
}