package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controlador.Controller;
import main.PilaPosiciones;
import observers.RangoObserver;

public class PanelOeste extends JPanel implements ActionListener, RangoObserver{
	
	private static final long serialVersionUID = 1L;
	
	private JButton evaluate;
	private JButton[] players;
	private JTextField[] rangopls;
	private String rango;
	private Controller controller;
	
	public PanelOeste(Controller controller) {
		
		this.controller = controller;
		
		JButton player;
		JTextField rango;
		StringBuilder namePlayer = new StringBuilder();
		int tam=0;
		
		this.players = new JButton[9];
		this.rangopls = new JTextField[9];
		this.rango = new String();
		
		this.setLayout(new GridLayout(2, 0));
		
		JPanel norte = new JPanel();
		norte.setLayout(null);
		
		for(int i=0; i < 9; i++) {
			
			namePlayer.append("Player ");
			namePlayer.append(i);
			
			if(i==0){
				tam = 10;
				player = new JButton(namePlayer.toString());
				player.setBounds(7, tam, 90, 30);
				player.setMargin(new Insets(1,1,1,1));
				
				rango = new JTextField();
				rango.getPreferredSize();
				rango.setBounds(104, tam, 170, 32);
			}
			else {
				tam+= 35;
				player = new JButton(namePlayer.toString());
				player.setBounds(7, tam, 90, 30);
				player.setMargin(new Insets(1,1,1,1));
				
				rango = new JTextField();
				rango.getPreferredSize();
				rango.setBounds(104, tam, 170, 32);
				
			}
			
			this.players[i] = player;
			this.players[i].setEnabled(false);
			this.rangopls[i] = rango;
			
			norte.add(player);
			norte.add(rango);
			
			namePlayer.delete(0, namePlayer.length());
			
		}
		
		
		
		this.evaluate = new JButton("Evaluate");
		this.evaluate.setBounds(350, 200, 90, 30);
		this.evaluate.setMargin(new Insets(1,1,1,1));
		this.evaluate.addActionListener(this);
		norte.add(this.evaluate);
		
		
		
		this.add(norte);
		
		JPanel sur = new JPanel();
		JPanel vacio = new JPanel();
		JPanel vacio2 = new JPanel();
		sur.setLayout(new BorderLayout());
		JTextArea salida = new JTextArea(15,50);
		vacio2.setLayout(new BorderLayout());
		vacio2.add(salida);
		vacio2.setBorder(new TitledBorder("Salida"));
		sur.add(vacio2, BorderLayout.SOUTH);
		sur.add(vacio, BorderLayout.CENTER);
		this.add(sur);
		
		this.controller.addRangoObserver(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.evaluate) {
			this.rango = this.rangopls[0].getText();
			this.controller.nuevoRango(this.rango);
		}
	}

	@Override
	public void hayRangos(PilaPosiciones posiciones) {
		// TODO Auto-generated method stub
		
	}
}
