package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import controlador.Controller;


public class PanelEste extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	
	
	public PanelEste(Controller controller){
		
		this.setSize(500, 700);
		
		this.setLayout(new BorderLayout());
		
//		this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(), BorderFactory.createLoweredSoftBevelBorder()));
		
		this.add(new PanelGrid(controller), BorderLayout.NORTH);
		this.add(new PanelSliders(controller), BorderLayout.CENTER);
//		this.add(new PanelButtons(controller),BorderLayout.SOUTH);
	}
}
