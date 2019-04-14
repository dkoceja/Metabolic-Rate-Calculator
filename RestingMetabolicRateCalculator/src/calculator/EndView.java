package calculator;

import java.awt.BorderLayout;
import javax.swing.*;

public class EndView extends JPanel {
	
	public EndView(String rate) {
		setLayout(new BorderLayout());
		add(new JTextArea("YOUR RESTING METABOLIC RATE IS:", 3, 50), BorderLayout.NORTH);
		add(new JTextArea(rate), BorderLayout.SOUTH);
	}
}