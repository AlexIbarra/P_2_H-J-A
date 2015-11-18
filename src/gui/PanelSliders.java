package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelSliders extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	private JSlider slider;
	private JTextField porcentaje;
	
	
	public PanelSliders() {
		
		this.setLayout(null);
		
		JPanel jpSlider = new JPanel(new BorderLayout());
		JPanel jpPorcentaje = new JPanel(new BorderLayout());
		
		this.slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		this.slider.getBounds().setBounds(15, 40, 350, 45);
		jpSlider.setBounds(15, 40, 350, 50);
		jpSlider.setBorder(new TitledBorder("RANGO"));
		jpSlider.add(this.slider);
		
		this.porcentaje = new JTextField(5);
		jpPorcentaje.setBounds(375, 47, 50, 40);
		jpPorcentaje.add(this.porcentaje);
		
		
		this.add(jpSlider);
		this.add(jpPorcentaje);
		
		this.setBackground(Color.ORANGE);
		
	}

}
