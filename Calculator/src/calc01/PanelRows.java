package calc01;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.swing.JPanel;


public class PanelRows {

    private HashMap<String, List<String>> rows;
    private final int ROWS_LENGTH = 4;
    private ButtonFactory buttonFactory;

    public PanelRows(ButtonFactory buttonFactory){
        this.buttonFactory = buttonFactory;
        
        rows = new HashMap<String, List<String>>();

        for (int i = 0; i < ROWS_LENGTH; i++) {
            switch (i) {
                case 0:
                	rows.put(String.valueOf(i), List.of("7", "8", "9", "+"));
                    break;
                case 1:
                	rows.put(String.valueOf(i), List.of("4", "5", "6", "-"));
                    break;
                case 2:
                	rows.put(String.valueOf(i), List.of("1", "2", "3" , "*"));
                    break;
                case 3:
                	rows.put(String.valueOf(i), List.of("C" , "0" , "=" , "/"));
                    break;
            
                default:
                    throw new UnsupportedOperationException("Fehler im Konstruktor: " + toString());
            }
        }        
    }

    public List<JPanel> getRowPanels(){
        return rows.entrySet().stream().map(this::createRowPanel).collect(Collectors.toList());
    }

    private JPanel createRowPanel(Entry<String,List<String>> entry){
        List<BaseButton> buttons = entry.getValue().stream().map(buttonFactory::createBaseButton).collect(Collectors.toList());
        JPanel panel = new JPanel();
        buttons.forEach(panel::add);
        return panel;
    } 
    
}
