package ReverseApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ReverseFrame extends JFrame implements ActionListener {
    
    private JLabel textAusgabe;
    private JTextField textEingabe;

    public ReverseFrame(){
        setTitle("Reverse a String");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        textEingabe = new JTextField("Bitte gib einen Text ein");
        panel.add(textEingabe);

        textAusgabe = new JLabel("output");
        panel.add(textAusgabe);

        JButton changeTextButton = new JButton("Drehe den Text um");
        changeTextButton.addActionListener(this);
        panel.add(changeTextButton);

        
        add(panel);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = new StringBuilder(textEingabe.getText()).reverse().toString();
        textAusgabe.setText(text);
    }
}
