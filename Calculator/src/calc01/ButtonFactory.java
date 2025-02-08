package calc01;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ButtonFactory {
	
	private OutputField outputField;
	private Pattern numberPattern = Pattern.compile("^[0-9]+$");
	
	static final List<String> NUMBER_STRINGS = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9" );
    static final List<String> OPERATOR_STRINGS = List.of("+", "-", "*", "/" );
    static final String CLEAR = "C";
    static final String CALCULATE = "=";
	
	public ButtonFactory(OutputField outputField) {
		this.outputField = outputField;
	}
	
	public BaseButton createBaseButton(String string){
        if (NUMBER_STRINGS.contains(string)){
            return new NumberButton(outputField, string);
        }
        else if(OPERATOR_STRINGS.contains(string)){
            return new OperatorButton(outputField, string);
        }
        else if(CLEAR.equals(string)){
            return new ClearButton(outputField, string);
        }
        else if(CALCULATE.equals(string)){
            return new CalculateButton(outputField, string);
        }
        else{
            throw new RuntimeException("create Base Button, type not found: " + toString());
        }
    }
	
	public boolean isNumber(String value) {
    	Matcher matcher = numberPattern.matcher(value);
    	
    	if (matcher.matches()) {
            System.out.println("Valid number!");
            return false;
        } 
    	
        System.out.println("Invalid input.");
        return true;	
    }

}
