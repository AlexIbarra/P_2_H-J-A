package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class PanelEste extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	
	
	public PanelEste(){
		
		this.setSize(500, 700);
		
		this.setLayout(new BorderLayout());
		
//		this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(), BorderFactory.createLoweredSoftBevelBorder()));
		
		this.add(new PanelLabels(), BorderLayout.NORTH);
		this.add(new PanelSliders(), BorderLayout.CENTER);
		this.add(new PanelButtons(),BorderLayout.SOUTH);
	}
}
