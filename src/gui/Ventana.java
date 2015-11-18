package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	public Ventana () {
		
		this.setSize(1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new java.awt.GridLayout(0, 2));
		
		getContentPane().add(new PanelOeste());
		getContentPane().add(new PanelEste());
		this.setVisible(true);		
	}

}
