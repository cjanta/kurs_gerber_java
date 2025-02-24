package Aufgaben.A_Calculator.java.src;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelRowsFactory {

    private HashMap<String, List<String>> shemas;
    private final int ROWS_LENGTH = 4;
    private JTextField outLabel;

    public PanelRowsFactory(JTextField outLabel){

        this.outLabel = outLabel;
        shemas = new HashMap<String, List<String>>();

        for (int i = 0; i < ROWS_LENGTH; i++) {
            switch (i) {
                case 0:
                    shemas.put(String.valueOf(i), List.of("7", "8", "9", "+"));
                    break;
                case 1:
                    shemas.put(String.valueOf(i), List.of("4", "5", "6", "-"));
                    break;
                case 2:
                    shemas.put(String.valueOf(i), List.of("1", "2", "3" , "*"));
                    break;
                case 3:
                    shemas.put(String.valueOf(i), List.of("clear" , "0" , "calc" , "/"));
                    break;
            
                default:
                    throw new UnsupportedOperationException("Fehler im Konstruktor: " + toString());
            }
        }        
    }

    public List<JPanel> getRowPanels(){
        return shemas.entrySet().stream().map(this::createRowPanel).collect(Collectors.toList());
    }

    private JPanel createRowPanel(Entry<String,List<String>> entry){
        List<BaseButton> buttons = entry.getValue().stream().map(this::createBaseButton).collect(Collectors.toList());
        JPanel panel = new JPanel();
        buttons.forEach(button -> panel.add(button));
        return panel;
    }

    private BaseButton createBaseButton(String value){
        if (BaseButton.NUMBER_STRINGS.contains(value)){
            return new NumberButton(outLabel, value);
        }
        else if(BaseButton.OPERATOR_STRINGS.contains(value)){
            return new OperatorButton(outLabel, value);
        }
        else if(BaseButton.CLEAR.equals(value)){
            return new ClearButton(outLabel, value);
        }
        else if(BaseButton.CALCULATE.equals(value)){
            return new CalculateButton(outLabel, value);
        }
        else{
            throw new RuntimeException("create Base Button, type not found: " + toString());
        }
    }


  
    
}
