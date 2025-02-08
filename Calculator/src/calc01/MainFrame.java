package calc01;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	private OutputField outputField;

    public MainFrame(){
        setTitle("Taschenrechner (IHK-konform)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        outputField = new OutputField();              
        mainPanel.add(outputField);
        ButtonFactory buttonFactory = new ButtonFactory(outputField);
        
        PanelRows panelRows = new PanelRows(buttonFactory);
        panelRows.getRowPanels().forEach(mainPanel::add);
       
        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
