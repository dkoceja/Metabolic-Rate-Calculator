package calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;

public class View extends JPanel {
	
	private JPanel info_panel;
	private JPanel top_panel;
	private boolean buttonPressed;
	private String endRate;
	
	public View() {
		setLayout(new BorderLayout());
		buttonPressed = true;
		endRate = null;
		
		JPanel subpanel1 = new JPanel();
		subpanel1.setLayout(new BorderLayout());
		
		top_panel = new JPanel();
		top_panel.setLayout(new GridLayout(2,1));
		top_panel.add(new JTextArea("  For most accurate estimates, please keep the recorded diet consistent with prior eating. Please keep sodium near constant through testing. Weight measurements should be taken first thing in the morning before consumption of foods.", 3, 20));
		JTextArea endRateArea = new JTextArea("");
		top_panel.add(endRateArea);
		subpanel1.add(top_panel, BorderLayout.NORTH);
		
		JPanel firstSodium = new JPanel();
		firstSodium.setLayout(new GridLayout(1,2));
		
		firstSodium.add(new JTextArea("  How many mg of sodium did you consume the day before you started recording your week?"));
		JTextField firstSodiumAmount = new JTextField();
		firstSodium.add(firstSodiumAmount);
		
		subpanel1.add(firstSodium, BorderLayout.SOUTH);
		
		add(subpanel1, BorderLayout.NORTH);
		
		JPanel subpanel = new JPanel();
		subpanel.setLayout(new BorderLayout());
		
		/*JPanel day_panel = new JPanel();
		day_panel.setLayout(new GridLayout(1,7));
		
		day_panel.add(new JTextArea("  Day 1"));
		day_panel.add(new JTextArea("  Day 2"));
		day_panel.add(new JTextArea("  Day 3"));
		day_panel.add(new JTextArea("  Day 4"));
		day_panel.add(new JTextArea("  Day 5"));
		day_panel.add(new JTextArea("  Day 6"));
		day_panel.add(new JTextArea("  Day 7"));
		
		subpanel.add(day_panel, BorderLayout.NORTH);*/
		
		info_panel = new JPanel();
		info_panel.setLayout(new GridLayout(4,14));

		info_panel.add(new JTextArea("  Day 1"));
		info_panel.add(new JTextArea(""));
		info_panel.add(new JTextArea("  Day 2"));
		info_panel.add(new JTextArea(""));
		info_panel.add(new JTextArea("  Day 3"));
		info_panel.add(new JTextArea(""));
		info_panel.add(new JTextArea("  Day 4"));
		info_panel.add(new JTextArea(""));
		info_panel.add(new JTextArea("  Day 5"));
		info_panel.add(new JTextArea(""));
		info_panel.add(new JTextArea("  Day 6"));
		info_panel.add(new JTextArea(""));
		info_panel.add(new JTextArea("  Day 7"));
		info_panel.add(new JTextArea(""));
		
		info_panel.add(new JTextArea("  Calories", 1, 13));
		JTextField calories1 = new JTextField(5);
		info_panel.add(calories1);
		info_panel.add(new JTextArea("  Calories", 1, 13));
		JTextField calories2 = new JTextField(5);
		info_panel.add(calories2);
		info_panel.add(new JTextArea("  Calories", 1, 13));
		JTextField calories3 = new JTextField(5);
		info_panel.add(calories3);
		info_panel.add(new JTextArea("  Calories", 1, 13));
		JTextField calories4 = new JTextField(5);
		info_panel.add(calories4);
		info_panel.add(new JTextArea("  Calories", 1, 13));
		JTextField calories5 = new JTextField(5);
		info_panel.add(calories5);
		info_panel.add(new JTextArea("  Calories", 1, 13));
		JTextField calories6 = new JTextField(5);
		info_panel.add(calories6);
		info_panel.add(new JTextArea("  Calories", 1, 13));
		JTextField calories7 = new JTextField(5);
		info_panel.add(calories7);
		
		info_panel.add(new JTextArea("  Weight", 1, 13));
		JTextField weight1 = new JTextField(5);
		info_panel.add(weight1);
		info_panel.add(new JTextArea("  Weight", 1, 13));
		JTextField weight2 = new JTextField(5);
		info_panel.add(weight2);
		info_panel.add(new JTextArea("  Weight", 1, 13));
		JTextField weight3 = new JTextField(5);
		info_panel.add(weight3);
		info_panel.add(new JTextArea("  Weight", 1, 13));
		JTextField weight4 = new JTextField(5);
		info_panel.add(weight4);
		info_panel.add(new JTextArea("  Weight", 1, 13));
		JTextField weight5 = new JTextField(5);
		info_panel.add(weight5);
		info_panel.add(new JTextArea("  Weight", 1, 13));
		JTextField weight6 = new JTextField(5);
		info_panel.add(weight6);
		info_panel.add(new JTextArea("  Weight", 1, 13));
		JTextField weight7 = new JTextField(5);
		info_panel.add(weight7);
		
		info_panel.add(new JTextArea("  mg of Sodium", 1, 13));
		JTextField sodium1 = new JTextField(5);
		info_panel.add(sodium1);
		info_panel.add(new JTextArea("  mg of Sodium", 1, 13));
		JTextField sodium2 = new JTextField(5);
		info_panel.add(sodium2);
		info_panel.add(new JTextArea("  mg of Sodium", 1, 13));
		JTextField sodium3 = new JTextField(5);
		info_panel.add(sodium3);
		info_panel.add(new JTextArea("  mg of Sodium", 1, 13));
		JTextField sodium4 = new JTextField(5);
		info_panel.add(sodium4);
		info_panel.add(new JTextArea("  mg of Sodium", 1, 13));
		JTextField sodium5 = new JTextField(5);
		info_panel.add(sodium5);
		info_panel.add(new JTextArea("  mg of Sodium", 1, 13));
		JTextField sodium6 = new JTextField(5);
		info_panel.add(sodium6);
		info_panel.add(new JTextArea("  mg of Sodium", 1, 13));
		JTextField sodium7 = new JTextField(5);
		info_panel.add(sodium7);
		
		subpanel.add(info_panel, BorderLayout.NORTH);
		
		add(subpanel, BorderLayout.CENTER);
		
		JPanel button_panel = new JPanel();
		button_panel.setLayout(new BorderLayout());

		JButton button = new JButton("CALCULATE");
		button.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
				  double baselineSodium = Double.parseDouble(firstSodiumAmount.getText());
				  int days = 7;
				  Map<Integer, List<Double>> data = new HashMap<Integer, List<Double>>();
				  
				  List<Double> list1 = new ArrayList<Double>();
				  list1.add(Double.parseDouble(calories1.getText()));
				  list1.add(Double.parseDouble(weight1.getText()));
				  list1.add(Double.parseDouble(sodium1.getText()));
				  data.put(0, list1);
				  
				  List<Double> list2 = new ArrayList<Double>();
				  list2.add(Double.parseDouble(calories2.getText()));
				  list2.add(Double.parseDouble(weight2.getText()));
				  list2.add(Double.parseDouble(sodium2.getText()));
				  data.put(1, list2);
				  
				  List<Double> list3 = new ArrayList<Double>();
				  list3.add(Double.parseDouble(calories3.getText()));
				  list3.add(Double.parseDouble(weight3.getText()));
				  list3.add(Double.parseDouble(sodium3.getText()));
				  data.put(2, list3);
				  
				  List<Double> list4 = new ArrayList<Double>();
				  list4.add(Double.parseDouble(calories4.getText()));
				  list4.add(Double.parseDouble(weight4.getText()));
				  list4.add(Double.parseDouble(sodium4.getText()));
				  data.put(3, list4);
				  
				  List<Double> list5 = new ArrayList<Double>();
				  list5.add(Double.parseDouble(calories5.getText()));
				  list5.add(Double.parseDouble(weight5.getText()));
				  list5.add(Double.parseDouble(sodium5.getText()));
				  data.put(4, list5);
				  
				  List<Double> list6 = new ArrayList<Double>();
				  list6.add(Double.parseDouble(calories6.getText()));
				  list6.add(Double.parseDouble(weight6.getText()));
				  list6.add(Double.parseDouble(sodium6.getText()));
				  data.put(5, list6);
				  
				  List<Double> list7 = new ArrayList<Double>();
				  list7.add(Double.parseDouble(calories7.getText()));
				  list7.add(Double.parseDouble(weight7.getText()));
				  list7.add(Double.parseDouble(sodium7.getText()));
				  data.put(6, list7);
				  List<Double> rates = new ArrayList<Double>();
				  for (int i = 1; i < days-1; i++) {
						double weightToday = data.get(i).get(1);
						double weightYesterday = data.get(i-1).get(1);
						double weightDif = weightToday - weightYesterday;
						double fromTotal = weightDif * -3500;
						double todayRate = data.get(i-1).get(0) + fromTotal;
						rates.add(todayRate);
						}
					double totalRates = 0;
					int estimatedRate = 0;
					for (int j = 0; j < rates.size(); j++) {
						totalRates += rates.get(j);
					}
					estimatedRate = (int) (totalRates / rates.size());
				  String printRate = Double.toString(estimatedRate);
				  EndView lastView = new EndView(printRate);
					
					JFrame end_frame = new JFrame();
					end_frame.setTitle("Resting Metabolic Rate Calculator");
					end_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					end_frame.setContentPane(lastView);
					end_frame.pack();
					end_frame.setVisible(true);
			  }
			});
		button_panel.add(button);
		
		add(button_panel, BorderLayout.SOUTH);
	}
	
	public boolean getButtonPressed() {
		return buttonPressed;
	}
	
	public String getEndRate() {
		return endRate;
	}
	
}
