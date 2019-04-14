package calculator;

import java.util.*;
import java.util.List;

import javax.swing.*;

import java.awt.*;

public class Main {
	
	
	
	public static double calcRate(int days, Map<Integer, List<Double>> map) {
		List<Double> rates = new ArrayList<Double>();
		for (int i = 0; i < days-1; i++) {
			double weightToday = map.get(i+1).get(1);
			double weightYesterday = map.get(i).get(1);
			double weightDif = weightToday - weightYesterday;
			double fromTotal = weightDif * 3500;
			double todayRate = map.get(i).get(0) + fromTotal;
			rates.add(todayRate);
		}
		double totalRates = 0;
		double estimatedRate = 0;
		for (int j = 0; j < rates.size(); j++) {
			totalRates += rates.get(j);
		}
		estimatedRate = totalRates / rates.size();
		return estimatedRate;
		
	}

	public static void main(String[] args) {
		
		// new stuff
		
		View view = new View();
		
		JFrame main_frame = new JFrame();
		main_frame.setTitle("Resting Metabolic Rate Calculator");
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		main_frame.setContentPane(view);
		main_frame.getContentPane().setBackground(Color.WHITE);


		main_frame.pack();
		main_frame.setVisible(true);
		
	}

}
