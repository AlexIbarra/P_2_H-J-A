package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import controlador.Controller;

public class PanelSliders extends JPanel implements ActionListener{
	
	
	private static final long serialVersionUID = 1L;
	private JSlider slider;
	private JTextField porcentaje;
	private int value;
	StringBuilder porc;
	
	public PanelSliders(Controller controller) {
		
		this.setLayout(null);
		
		this.porc = new StringBuilder();
		
		JPanel jpSlider = new JPanel(new BorderLayout());
		JPanel jpPorcentaje = new JPanel(new BorderLayout());
		JPanel jpAll = new JPanel(new BorderLayout());
		JPanel jpAnySuited = new JPanel(new BorderLayout());
		JPanel jpAnyBroadway = new JPanel(new BorderLayout());
		JPanel jpAnyPair = new JPanel(new BorderLayout());
		JPanel jpClear = new JPanel(new BorderLayout());
		
		
		jpSlider.setBounds(15, 40, 350, 50);
		jpPorcentaje.setBounds(375, 47, 55, 40);
		jpAll.setBounds(17, 120, 110, 30);
		jpAnyPair.setBounds(17, 167, 110, 30);
		jpAnySuited.setBounds(137, 120, 110, 30);
		jpAnyBroadway.setBounds(137, 167, 110, 30);		
		jpClear.setBounds(258, 120, 60, 30);
		
		
		this.slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		this.porcentaje = new JTextField(5);
		this.porcentaje.setHorizontalAlignment(JTextField.CENTER);
		JButton all = new JButton("All");
		all.setMargin(new Insets(1,1,1,1));
		JButton anyPair = new JButton("Any Pair");
		anyPair.setMargin(new Insets(1,1,1,1));
		JButton anySuited = new JButton("Any Suited");
		anySuited.setMargin(new Insets(1,1,1,1));
		JButton anyBroadway = new JButton("Any Broarway");	
		anyBroadway.setMargin(new Insets(1,1,1,1));
		JButton clear = new JButton("Clear");
		clear.setMargin(new Insets(1,1,1,1));
		
		
		jpSlider.add(this.slider);
		jpSlider.setBorder(new TitledBorder("RANGO"));
		jpPorcentaje.add(this.porcentaje);
		jpAll.add(all);
		jpAnyPair.add(anyPair);
		jpAnySuited.add(anySuited);
		jpAnyBroadway.add(anyBroadway);
		jpClear.add(clear);
		
		
		
		this.add(jpSlider);
		this.add(jpPorcentaje);
		this.add(jpAll);
		this.add(jpAnyPair);
		this.add(jpAnySuited);
		this.add(jpAnyBroadway);
		this.add(jpClear);
		
		
		this.slider.addChangeListener(new ChangeListener() {
		      public void stateChanged(ChangeEvent e) {
		    	value = slider.getValue();
		    	porc.append(Integer.toString(slider.getValue()));
		    	porc.append("%");
		    	porcentaje.setText(porc.toString());
		  		porcentaje.repaint();
		  		porc.delete(0, porc.length());
		      }
		 });
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		this.porcentaje.setText(Integer.toString(this.slider.getValue()));
		this.porcentaje.repaint();
		
	}

}
