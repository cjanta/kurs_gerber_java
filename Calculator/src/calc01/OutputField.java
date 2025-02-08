package calc01;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;

public class OutputField extends JTextField{
	
	private final Color DEFAULT_COLOR = new Color(255, 255, 245);
	private final Color ERROR_COLOR = Color.RED;

	public OutputField() {
		setText("");
        setBackground(DEFAULT_COLOR);
        setSize(new Dimension(100, 33));
        setFocusable(false);
	}
	
	public void append(String string) {
		setText(getText() + string);
	}
	
	public void appendError(String string) {
		setText(getText() + string);
		setBackground(ERROR_COLOR);
	}
	
	public void clear() {
		setText("");
		setBackground(DEFAULT_COLOR);
	}
}
