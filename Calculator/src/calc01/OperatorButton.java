package calc01;

import java.awt.event.ActionEvent;

public class OperatorButton extends BaseButton {

    String operator;

    public OperatorButton(OutputField outputField, String operator) {
        super(outputField);
        this.operator = operator;
        setText(operator);
    }
    
    
    private boolean isLastCharOperator(String value) {
    	return ButtonFactory.OPERATOR_STRINGS.contains(value.substring(value.length() - 1)); 	
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	if (!outputField.getText().trim().isEmpty()  && !isLastCharOperator(outputField.getText()) && !isCalculationFinished()) {
    		outputField.setText(outputField.getText() + " " + operator);    		
    	}
    }
}
