package gui;

import java.awt.BorderLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelButtons extends JPanel {
	
	
	public PanelButtons() {
		
		this.setLayout(null);
		
		JButton all = new JButton("All");
		all.setBounds(20, 20, 60, 30);
		all.setMargin(new Insets(1,1,1,1));
		
		JButton anySuited = new JButton("Any Suited");
		JButton anyBroadway = new JButton("Any Broarway");
		JButton anyPair = new JButton("Any Pair");
		JButton clear = new JButton("Clear");
		
		JLabel jlSelected = new JLabel("Slected");
		JTextField tfSlected = new JTextField();
		
		this.add(all);
		this.add(anySuited);
		this.add(anyBroadway);
		this.add(anyPair);
		this.add(clear);
		this.add(jlSelected);
		this.add(tfSlected);
	}

}
