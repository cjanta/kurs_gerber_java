package calc01;

import java.awt.event.ActionEvent;


public class CalculateButton extends BaseButton {
	
    public CalculateButton(OutputField outputField, String text) {
        super(outputField);
        setText(text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {  
    	if(!isCalculationFinished()) {
    		calculate();
    	}
    }
    
    private void calculate() {
        String[] parts = outputField.getText().split("\\s+");
        int result = Integer.parseInt(parts[1]); 

        for (int i = 2; i < parts.length; i += 2) { 
            String operator = parts[i];
            int num = Integer.parseInt(parts[i + 1]);

            switch (operator) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    if (num != 0) {
                        result /= num;
                    } else {
                    	outputField.appendError(" = ERROR");
                    	return;
                    }
                    break;
                default:
                	throw new RuntimeException("Operator: " + operator + " wird nicht unterstützt");
            }
        }
        outputField.append(" = " + String.valueOf(result));     
    }    
    
}
