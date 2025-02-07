package Aufgaben.A_Calculator.java.src;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame  {

    private JTextField outputLabel;

    public MainFrame(){
        setTitle("Taschenrechner (IHK-konform)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        outputLabel = new JTextField();
        outputLabel.setText(" ");
        outputLabel.setBackground(new Color(223,197,123));
        outputLabel.setSize(new Dimension(100, 33));

        mainPanel.add(outputLabel);

        PanelRowsFactory fac = new PanelRowsFactory(outputLabel);
        fac.getRowPanels().forEach(mainPanel::add);
       
        add(mainPanel);
        pack();
        setVisible(true);
    }

    
}
