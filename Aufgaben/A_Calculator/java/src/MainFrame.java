package Aufgaben.A_Calculator.java.src;


import java.awt.Dimension;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame  {

    private JLabel outputLabel;

    public MainFrame(){
        setTitle("Taschenrechner (IHK-konform)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        outputLabel = new JLabel();
        outputLabel.setText(" ");
        outputLabel.setSize(new Dimension(100, 33));

        mainPanel.add(outputLabel);

        PanelRowsFactory fac = new PanelRowsFactory(outputLabel);
        List<JPanel> rowPanels = fac.getRowPanels();
        rowPanels.forEach(mainPanel::add);
       

        add(mainPanel);
        pack();
        setVisible(true);
    }

    
}
